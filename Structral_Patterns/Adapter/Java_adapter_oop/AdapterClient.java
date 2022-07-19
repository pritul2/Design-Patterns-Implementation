

/* Web Server is an adaptee class and it is part of some another system
 * This is providing service related to json
 */
class WebServer{
    public Json request(Json input){
        Json output =  new Json();
        //Do some logic
        return output;
    }
}


/* Creating the target interface WebRequester
 * This contains the request feature. The definition of this request feature will be provided by the adapter class
 */
interface  WebRequester{
    public int request(Object obj);
}


/* Adapter class
 * This is providing the implementation of WebRequester to convert the Object datatype into Json type and passing to the adaptee class
 * This is also establishing the connection between the client and server
 */

class WebAdapter implements WebRequester{

    private WebServer service;

    public void connectToServer(WebServer currentService){
        //Do some manipulation and connect to the web-server
        this.service = currentService;
    }

    private Json convertJson(Object obj){
        // Internal logic of conversion
        return Json;
    }

    public int request(Object request){
        Json result = this.convertJson(request);
        Json output = service.request(result);

        if (output == null){
            return 501;
        }
        else{
            return 1;
        }
    }
}



/* The client will directly utilize the web client class to get the response.
 * The web client will NOT call ADAPTER but it will call the target interface.
 * However when the WebClient object is created we will directly connect it with the adapter using the constructor.
 */

class WebClient {

    //Object of type target interface
    private WebRequester requestObj;

    //Connecting the web client with the adapter
    public WebClient(WebRequester adapterObject){
        this.requestObj = adapterObject;
    }

    private Object makeObject(){
        Object obj = new Object();
        //Logic for creating the object
        return Object;
    }

    //Getting the response from the web server via adapter
    public void doWork(){
        Object obj = makeObject();
        int status = requestObj.request(obj);
        System.out.println("The status is ",status);
        return;
    }
}

public class AdapterClient {
    public static void main(String [] args){
        WebServer sevice = new WebServer();
        WebAdapter adapter = new WebAdapter();
        adapter.connect(service);
        WebClient client = new WebClient(adapter);
        client.doWork();


    }
}
