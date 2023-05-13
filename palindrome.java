class Check
{
    int num;
   Check(int num) 
   {
    this.num=num;
   }
   public void view()
   {
    int rem;
    int x,rev=0;
    x=num;
    if(num>0)
    {
        while(num!=0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if(x==rev)
        {
            System.out.println(x+" is a paliandrome number.");
        }
        else
        {
            System.out.println(x+" is not a paliandrome number.");
        }
    }
    else
    {
        System.out.println("Enter a valide number or positive number.");
    }
   }
}

public class palindrome {
    public static void main(String args[])
    {
        Check c = new Check(528);
        Check c1= new Check(525);
        Check c2= new Check(545);
        c.view();
        c1.view();
        c2.view();

    }
}
