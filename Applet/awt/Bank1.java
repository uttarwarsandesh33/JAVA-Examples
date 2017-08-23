class NoMoneyException extends Exception
{
    public NoMoneyException(String message)
    {
        super(message);
    }
}
public class Bank
{
    public static void main(String args[]) throws NoMoneyException
    {
           int balance=5000, withdraw=10000;
           if(balance < withdraw)
       	throw new NoMoneyException("Insufficient Funds");
           else
 	System.out.println("Draw & Enjoy");
    }
}
