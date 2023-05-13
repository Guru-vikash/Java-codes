package bpack;
import apack.A;
public class B extends A
    {
    public B(int a,int b,int c)
    {
    super(a,b,c);
    }
    public void display()
    {
    System.out.println("From Package B:");
    System.out.println("A = "+a+" C = "+c);
  
    }
}
    