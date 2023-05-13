import java.io.*;
class string 
{
    String st;
    public stringmthods(String st)
    {
        this.st=st;
    }

public class stringmethods {
    public static void main(String args[])
    {
        String st = new String("Bikash pradhan");

        System.out.println("Length Of String = "+st.length());
    }

	public void string_charat(int c)
	{
		char ch = st.charAt(c);
		System.out.println("charAt Of String = "+ch);
	}
}
}	
// 	public void string_getchars(int start,int end)
// 	{
// 		char arr[] = new char[end-start];
// 		st.getChars(start,end,arr,0);
// 		System.out.print("GetChars of String = ");
// 		System.out.println(arr);
// 	}
	
// 	public void string_tochararray()
// 	{
// 		char arr[] = st.toCharArray();
// 		System.out.print("toCharArray of String = ");
// 		System.out.println(arr);
// 	}
	
// 	public void string_equalsto(String str2)
// 	{
// 		System.out.println("EqualsTo of String = "+st.equals(str2));
// 	}
	
// 	public void start_endwith()
// 	{
// 		System.out.println("Startwith of String (Java) = "+st.startsWith("Java"));
// 		System.out.println("Endwith of String (s) = "+st.endsWith("s"));
// 	}
	
// 	public void string_compare(String str2)
// 	{
// 		System.out.println("CompareTo of String = "+st.compareTo(str2));
// 	}
	
// 	public void string_indexof(char ch1)
// 	{
// 		System.out.println("Index of String = "+st.indexOf(ch1));
// 	}
// 	public void string_lastindexof(char ch2)
// 	{
// 		System.out.println("Last Index of String = "+st.lastIndexOf(ch2));
// 	}
// 	public void string_substr(int end)
// 	{
// 		System.out.println("Substring of String = "+st.substring(end));
// 	}
// }
// public class string_methods
// {
// 	public static void main(String args[])
// 	{
// 		int start = 2;
// 		int end = 4;
// 		char ch1 = 'J';
// 		char ch2 = 'o';
// 		string str = new string("HewlloWorld Java Programs");
// 		string str2 = new string("hello");
// 		System.out.print("String 1 = ");
// 		str.to_String();
// 		String s2 = str2.toString();
// 		System.out.print("String 2 =");
// 		str2.to_String();
// 		str.string_length();
// 		str.string_charat(2);
// 		str.string_getchars(start,end);
// 		str.string_tochararray();
// 		str.string_equalsto(s2);
// 		str.start_endwith();
// 		str.string_compare(s2);
// 		str.string_indexof(ch1);
// 		str.string_lastindexof(ch2);
// 		str.string_substr(end);
// 	}
// }
// class string_buffer
// {
// 	public static void main(String args[])
// 	{
// 		StringBuffer sb = new StringBuffer("HewlloWorld Java Programs");
// 		System.out.println(sb);
// 		System.out.println("String Buffer Length = "+sb.length());
// 		System.out.println("String Buffer capacity = "+sb.capacity());
		
// 		sb.setLength(10);
// 		System.out.println("String Buffer setlength (10) = "+sb);
		
// 		sb.append("Java").append("Language");
// 		System.out.println("Append String (Java,Language) = "+sb);
		
// 		sb.insert(10," Programs");
// 		System.out.println("Insert String at 10 index ( Programs) = "+sb);
	

// }
