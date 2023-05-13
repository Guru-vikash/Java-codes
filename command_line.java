import java.util.Scanner;
public class command_line 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String [] str={"First","Second","Third","Fourth"};
        System.out.println("Number of student = ");
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
                System.out.println(i+1+"."+str[i]+" Student name is = "+args[i]);		
        }	
    }    
}
