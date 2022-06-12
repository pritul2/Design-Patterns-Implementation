


// Defining our Printer class. This possesses device driver code
class Printer{


    //A fixed static printer object which is returned on demand
    // You can also initialize it with Null first and use if-else in Factory method
    public static Printer p = new Printer();


    /*Printer class has a Private Constructor. 
    Thus no one from outside can make it's object.
    But same class can create it's object. */
    private Printer(){
        System.out.println("Private Printer initialized");
    }


    //A factory method to get the fixed static printer object
    public static Printer getInstance(){
        return p;
    }

}


class singleton{
    public static void main(String [] args){

        //Providing different documents to printer for print

        System.out.println("Preparing to print the document 1");
        Printer document1 = Printer.getInstance();
        System.out.println("Preparing to print the document 2");
        Printer document2 = Printer.getInstance();
        System.out.println("Preparing to print the document 3");
        Printer document3 = Printer.getInstance();
    }

}

/*Output:
Preparing to print the document 1
Private Printer initialized
Preparing to print the document 2
Preparing to print the document 3*/