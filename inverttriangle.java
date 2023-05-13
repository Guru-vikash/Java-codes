import java.util.Scanner;
public class inverttriangle 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x =");
        int x=sc.nextInt();
        System.out.println("Right triangle is =");
        for(int i=1;i<=x;i++)
        {
            for(int z=0;z<i;z++)
            {
                System.out.print(" ");
            }
            for(int j=x-i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
