
class BankAcc
{
    int balance = 10000;
    class Interest
    {
        void displayBalance()
        {
            System.out.println("Balance is: Rs. "+ balance);
        }

        void CalculateInterest()
        {
            double interest = balance * 0.5 ;
            System.out.println("interest on " + balance + " is " + interest );
        }
    }

}
public class BankAccount
{
    public static void main(String[] args)
    {
        BankAcc b = new BankAcc();
        BankAcc.Interest a = b.new Interest();
        a.displayBalance();
        a.CalculateInterest();
    }
}
