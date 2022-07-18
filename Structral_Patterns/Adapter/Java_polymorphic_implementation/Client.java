public class Client{
    public static void main(String[] args){
        ClientService service = new ClientService();

        int response = service.methodCaller("B", 10);
        System.out.println("Response "+(response));


        response = service.methodCaller("D", 10);
        System.out.println("Response "+(response));
    }
}

/*Output:
 * Response 1
 * Response 500
 */