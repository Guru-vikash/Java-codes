import java.util.Scanner;
public class perfectno {
    public static void main(String args[])
    {
       int sum=0;
       int num;
       System.out.print("Enter any number =");
        Scanner sc = new Scanner(System.in);
        num =sc.nextInt();
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(num==sum)
        {
            System.out.print("Perfect number.");
        }
        else
        {
            System.out.print("Not perfect number.");
        }
    }
}
