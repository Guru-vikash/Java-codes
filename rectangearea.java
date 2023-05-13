public class rectangearea 
{
	public static void main(String []args)
	{
        Rectangle r=new Rectangle(10,20);
		r.Area(40,50);
	}
}
class Rectangle
{
    int length;
    int width;
    public Rectangle(int len,int wid)
    {
        this.length=len;
        this.width=wid;
    }
    public int Area(int len,int wid)
    {
        System.out.println("Arear of the rectangel is ="+ len*wid);
        return 0;
    }
}


// // class rectangle
// {
// 		int length;	
// 		rectangearea()
// {
// 			int breath;
// 		} 
// }
// public class rectangleClassInsideClass
// {
// 	public static void main(String args[])
// {	
// 		rectangle r = new rectangle();
// 		rectangle.rectanglecalculate r1 = r.new rectanglecalculate();
// 		r.length = 10;
// 		r1.breath = 20;
// 		System.out.println("Area Of rectangle = " +r.length*r1.breath);
// 	}
// }



