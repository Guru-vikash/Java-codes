public class constructor {
    public static void main(String[] args)
    {
        triangle t = new triangle(10,"akash",60);
        triangle t1;
        t1=new triangle(90,"ankit",100);
        t.area();
        t1.area();
    }
    
}
class triangle
{   
    int r;
    String n;
    int m;
    void area()
    {
        System.out.println("Student roll_no is ="+r);
        System.out.println("Student name is ="+n);
        System.out.println("Student marks is ="+m);
    }
    triangle(int roll_no,String name,int marks)
    {
        r=roll_no;
        n=name;
        m=marks;
    }
}
