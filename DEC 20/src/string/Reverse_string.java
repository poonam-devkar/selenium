package string;


public class Reverse_string
{
	



	public static void main(String[] args)
	{
	String name="Poonam";
	int len=name.length();
	String rev="";
	
	for(int i=len-1;i>=0;i--)
	{
		
		rev=rev+name.charAt(i);
	}
		System.out.println(rev);
	}
	
}

	

