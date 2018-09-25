package bank.MybankDemo;

/**
 * Hello world!
 *
 */
public class TestClass 
{
    public static void main( String[] args )
    {
        Deposit MyDeposit = new Deposit(12345);
        
        double result = MyDeposit.depositAmount(12345,500.00);
    
        System.out.println("My new Balace = "+result);
    }
    
}
