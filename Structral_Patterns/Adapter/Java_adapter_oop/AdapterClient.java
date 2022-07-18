
class WebServer{

}

interface  WebRequester{
    public int request(Object);
}



class WebAdapter implements WebRequester{
    private Json convertJson(Object obj){
        // Internal logic of conversion
        return Json;
    }
    public int request(Object request){
        Json result = this.convertJson(request);
    }
}

class WebClient {
    private Object makeObject(){
        obj  = new Object();
        //Logic of developing the object
        return obj;
    }
    public void doWork(){
        Object obj = makeObject();
        int status = new WebRequester().request(obj);
        System.out.println("The status is ",status);
        return;
    }
}

public class AdapterClient {
    public static void main(String [] args){

    }
}
