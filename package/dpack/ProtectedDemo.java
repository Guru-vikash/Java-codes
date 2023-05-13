package dpack;
import bpack.B;
import cpack.C;
public class ProtectedDemo {
    public static void main(String []args)
{
    B bObj = new B(10,20,30);
    C cObj = new C();
    bObj.display();
    cObj.display();
}

}
