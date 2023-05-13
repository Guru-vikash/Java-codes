public class frequency {
    public static void main(String []args)
	{
		System.out.println("String Passed By Argumnet : "+args[0]);
		int letters = 0, digits = 0;		

		String str = args[0];
		str = str.toLowerCase();

		for(int i=0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				letters++;			
			}
			else if(ch >= '0' && ch <= '9')
			{
				digits++;			
			}
		}	
		System.out.println("Letters : " +letters);
		System.out.println("Digits : " +digits);	
	}

}
