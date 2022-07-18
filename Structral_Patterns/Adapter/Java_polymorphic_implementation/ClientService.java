class ClientService{
    Child1 child1 = new Child1();
    Child2 child2 = new Child2();

    public ClientService(){}

    public int methodCaller(String s, int value){
        switch(s){
            case "A":
            child1.methodA(value);
            break;
            
            case "B":
            child1.methodB(value);
            break;

            case "C":
            child2.methodA(value);
            break;
           
            default:
            return 500;
        }
        return 1;
    }
}