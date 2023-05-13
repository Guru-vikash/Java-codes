import java.util.Scanner;
public class practice
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the no. of student =");
        int x = scan.nextInt();
        String str[] = {"first","seconde","Third","fourth"};
        for(int i=0;i<x;i++)
        {
            System.out.println((i+1)+str[i]+" name is "+args[i]);
        }
       scan.close();
    }
}