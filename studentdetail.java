public class studentdetail {
    public static void main(String []args)
	{
		Student s = new Student(100,"Bikash pradhan","Male",50);
		s.display();

		Student s1 = new Student(200,"Karishma pradhan","female",80);
		s1.display();	
	}
}
class Student
{
	int enroll_no;
	String name;
	String gender;
	int marks;
	public static int count;
	
	public Student()
    {
		
	}
	
	public Student(int enroll_no,String name,String gender,int marks)
    {
		this.enroll_no = enroll_no;
		this.name = name;
		this.gender = gender;
	 	this.marks = marks;	
	}	

	public void display()
    {	
		count++;
		System.out.println("Counted Students : "+count);
		System.out.println("Enrollment No:- "+enroll_no);
		System.out.println("Student Name:- "+name);
		System.out.println("Gender:- "+gender);
		System.out.println("Marks:- "+marks+"\n");	
	}
}
