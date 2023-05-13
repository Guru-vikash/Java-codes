public class SampleInheritance {
	public static void main(String[] args) {
		// Base b = new Base("Base Class String");
		// b.display();

		Derived d = new Derived("Base Class String", "Derived Class String");
		d.display();
	}
}

class Base
{
	private String baseStr;
	public Base(String str) {
		System.out.println("Inside Base class constructor");
		baseStr = str;
	}
	public String getBaseStr() {
		return baseStr;
	}
	public void setBaseStr(String str) {
		baseStr = str;
	}
	public void display() {
		System.out.println("Inside Base.display() method");
		System.out.println(baseStr);
	}
}

class Derived extends Base
{
	private String derivedStr;
	public Derived(String baseStr, String derivedStr) {
		//super();	// Generates error as there is no default constructor in superclass
		super(baseStr);
		// super.baseStr = baseStr;
		System.out.println("Inside Derived class constructor");
		this.derivedStr = derivedStr;
		//super(baseStr);	// Generates error
	}
	public Derived() {
		super("parent class");
		derivedStr = "Using default constructor";
	}
	public String getDerivedStr() {
		return derivedStr;
	}
	public void setDerivedStr(String str) {
		derivedStr = str;
	}
	public void display() {
		System.out.println("\n\nInside Derived.display() method");
		// System.out.println(baseStr); // Generates error as baseStr is private in Base class
		
		super.display();
		System.out.println(derivedStr);
		// OR
		// System.out.println(getBaseStr());

		
	
}
    
}
