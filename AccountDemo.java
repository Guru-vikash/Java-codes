public 	 class AccountDemo
{
    public static void main(String args[])
    {
        Account s = new Saving(1101,0);
        System.out.println("\n***** Saving Account Details *****");
        s.depositBalance(1000);
        s.withdrawBalance(400);
        s.withdrawBalance(300);
        s.withdrawBalance(500);
    }
}
abstract class Account
{
    private long accountNo=0;
    protected double balance=0.0;
public Account()
{
    this.accountNo=0;
    this.balance=0.0;
}
public Account(long x, double y)
{
    this.accountNo = x;
    this.balance = y;
}
public void checkBalance(){
    System.out.println("\nTotal Balance: "+ balance);
}
    public void depositBalance(double x)
{
    System.out.println("\nDeposited Ammount: "+ x);
    balance = balance + x;
checkBalance();
}
    public abstract void withdrawBalance(double x);
}

class Saving extends Account
{
    public Saving()
    {
        this(0,0.0);
    }
    public Saving(long a,double b)
    {
        super(a,b);
    }
    public void withdrawBalance(double x)
    {
        System.out.println("\nWithdrawn Ammount: "+ x);
    if((super.balance-x) > 0)
    {
        super.balance = super.balance - x;
        checkBalance();
    }
    else
    {
        String msg="";
        msg+="\nYou can not withdraw "+x;
        msg+="\ninsufficient balance in your account"; msg+="\nSaving Account balance :"+super.balance; msg+="\n*********************************************";
        throw new ArithmeticException(msg);
    }
    }
}
