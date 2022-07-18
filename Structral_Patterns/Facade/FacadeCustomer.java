import java.math.BigDecimal;
import java.util.Hashtable;

/* Step 1:
 * Creating the interface.
 * We are creating the IAccount interface with some methods
 * IAccount will have three features: Withdraw Money, Deposit Money, Transfer Money
*/

public interface IAccount {
    public void withdraw(BigDecimal amount);

    public void deposit(BigDecimal amount);

    public void transfer(BigDecimal amount);
}

/*
 * Step 2:
 * Defining classes that provide definition of interface
 */

public class Chequing implements IAccount {

    //Creating the constructor
    public Chequing(BigDecimal amount){}

    public void withdraw(BigDecimal amount) {
        // Withdraw feature implementation
    }

    public void deposit(BigDecimal amount) {
        // Deposit feature implementation
    }

    public void transfer(BigDecimal amount) {
        // Transfer feature implementation
    }

}

public class Saving implements IAccount {

    //Creating the constructor
    public Saving(BigDecimal amount){}


    public void withdraw(BigDecimal amount) {
        // Withdraw feature implementation
    }

    public void deposit(BigDecimal amount) {
        // Deposit feature implementation
    }

    public void transfer(BigDecimal amount) {
        // Transfer feature implementation
    }

}

public class Investment implements IAccount {

    //Creating the constructor
    public Investment(BigDecimal amount){}


    public void withdraw(BigDecimal amount) {
        // Withdraw feature implementation
    }

    public void deposit(BigDecimal amount) {
        // Deposit feature implementation
    }

    public void transfer(BigDecimal amount) {
        // Transfer feature implementation
    }

}

/*
 * Step 3:
 * Creating the facade class that wraps the interface
 * This is providing the service to the customer
 */

public class BankService {

    // Defining one private dictionary of bankaccounts
    private Hashtable<Integer,IAccount> bankAccounts;

    //Initializing the bankaccounts through public constructor
    //If constructor is private we can't create the object
    public BankService(){
        this.bankAccounts = new Hashtable <Integer, IAccount>();
    }

    // Creating method create new account that will be directly accessed by client
    // We will store with some initial money
    public int createNewAccount(String type, BigDecimal initAmount) {
        IAccount newAccount = null;
        switch (type) {
            case "chequing":
            newAccount = new Chequing(initAmount);
            break;
            case "saving":
            newAccount = new Saving(initAmount);
            break;
            case "investment":
            newAccount = new Investment(initAmount);
            break;
            default:
            System.out.println("Invalid account type");
            break;
        } 
    }
}

/*
 * Step 4:
 * Creating the customer class to access this facade class
 */

public class FacadeCustomer{
    public static void main(String[] args){
        BankService myBankService = new BankService();
        int mySaving = myBankService.createNewAccount("saving",new BigDecimal(500.00));
        int myInvestment = myBankService.createNewAccount("investment", new BigDecimal(1000.00));
    }
}

// This is how facade works !!
// Note: If any class or interface is public. Always create a seperate and new java file