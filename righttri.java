import java.util.Scanner;
public class righttri
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x =");
        int x=sc.nextInt();
        System.out.println("Right triangle is =");
        for(int i=1;i<=x;i++)
        {
           
            for(int z=x-i;z>=0;z--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}