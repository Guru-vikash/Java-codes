abstract class Shape
{
    private String name;
    Shape(String name)
    {
   	 this.name=name;
    }
    public String getname()
    {
   	 return name;
    }
    abstract double area();
}
class Rectangle extends Shape
{
    private int h;
    private int w;
    Rectangle(int h,int w,String name)
    {
   	 super(name);
   	 this.h=h;
   	 this.w=w;
    }
    public double area()
    {
   	 return h*w;
    }
}
class Triangle extends Shape
{
    private int h;
    private int w;
    Triangle(int h,int w,String name)
    {
   	 super(name);
   	 this.h=h;
   	 this.w=w;
    }
    
    public double area()
    {
   	 return 0.5*h*w;
    }
    
}
class Circle extends Shape
{
    private int redius;
    Circle(int redius,String name)
    {
   	 super(name);
   	 this.redius=redius;
   	 
    }
    
    public double area()
    {
   	 return Math.PI*redius*redius;
    }
}
class ShapeP
{
    public static void main(String args[])
    {
   		 Shape s = new Rectangle(20,10,"Rectangle");
   		 System.out.println(""+s.getname()+" in Area:"+s.area());
   	 	 Shape s1 = new Triangle(50,25,"Triangle");
   		 System.out.println("\n"+s1.getname()+" in Area:"+s1.area());    

   	 	 Shape s2=new Circle(10,"Circle");
   		 System.out.println("\n"+s2.getname()+" in Area:"+s2.area());    

   	 
    }
}


