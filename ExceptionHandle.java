// import java.io.*;
// class Example_Throw
// {
//     void testMethod(int num) throws IOException, ArithmeticException
// {
//     if(num==1)
//         throw new IOException("IOException Occurred");
//     else
//         throw new ArithmeticException("ArithmeticException");
// }
// }
// public class ExceptionHandling
// {
// static void validate_Age(int age)
// {
//     if(age<18)
//         throw new ArithmeticException("Not eligible to vote and drive!!");
//     else
//         System.out.println("Eligible to vote and drive!!");
//     }
// public static void main(String[] args)
// {
// try{

// try{
// System.out.println("Try Block1");
// int num =15/0;
// System.out.println(num);
// }
// catch(ArithmeticException e1){
// System.out.println("Block1 Exception: e1");
// }

// try{
// System.out.println("Try Block2");
// int num =100/0;
// System.out.println(num);
// }
// catch(ArrayIndexOutOfBoundsException e2){
// System.out.println("Block2 Exception: e2");
// }
// System.out.println("General statement after Block1 and Block2");
// }
// catch(ArithmeticException e3){
// System.out.println("Main Block Arithmetic Exception");
// }
// catch(ArrayIndexOutOfBoundsException e4){
// System.out.println("Main Block ArrayIndexOutOfBoundsException");
// }
// catch(Exception e5){
// System.out.println("Main Block General Exception");
// }

// validate_Age(19);
// try {
// Example_Throw obj=new Example_Throw();
// obj.testMethod(1);
// }
// catch(Exception ex){
// System.out.println(ex);
// }
// finally {
// System.out.println (":: Finally Block::");
// }
// }
// }
import java.util.Scanner;
public class ExceptionHandle
{
    public static void main(String[] args)
    {
        int a ,b ,div;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first value =");
        a = sc.nextInt();
        System.out.print("Enter a seconde value =");
        b = sc.nextInt();

    try{
        if(a==0)
        {
            throw new Exception("First value is not valide .");   
        }
        else{
            div=a/b;
            System.out.println("Div ="+div);
        }
    }
    catch(ArithmeticException e){
        System.out.println("ArithmeticException :"+e);
    }
    catch(Exception e)
    {
        System.out.println("Exception:"+e);
    }
    finally{
        System.out.println("Finally ");
    }
    }
}