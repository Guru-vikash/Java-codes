package apack;
public class A{
    public int a;
    private int b;
    protected int c;
    public A(int a,int b,int c)
    {
    this.a=a;
    this.b=b;
    this.c=c;
    }
    public void display()
    {
    System.out.println("From Package A:");
    System.out.println("A = "+a+" B = "+b+" C = "+c);
    }
}
    