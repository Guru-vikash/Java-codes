public class Rectangel{
    public static void main(String args[])
	{
		Rect r = new Rect();
		r.display();
		
		Rect r1 = new Rect(12,30);
		r1.display();
		
		Rect r2 = new Rect(r);
		r2.display();
	}
}
class Rect
{
	private int length;
	private int width;
	public static int count = 0;
	public Rect()
    {
	this(0,0);
	System.out.println("Default constructor .");
	}
	
	public Rect(int len,int wid)
    {
	length = len;
	width = wid;
	System.out.println("Parameterized Constructor.");
	}
	
	public Rect(Rect r)
	{
		this.length = r.length;
		this.width = r.width;
		System.out.println("Copy Constructor");
	}
	
	public int area_rect(int length,int breath)
    {
		return length*breath;
	}

	public void display()
	{
		count++;
		System.out.println("Number Of Rectangle = "+count);
		System.out.println("Length Of Rectangle = "+length);
		System.out.println("Breath Of Rectangle = "+width);
		System.out.println("Area Of Rectangle = "+area_rect(length,width)+"\n");
	}
}

