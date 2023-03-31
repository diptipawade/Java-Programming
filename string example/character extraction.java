/* Program to count the frequency of a given letter in a string. */

import java.io.*;     

class P22
{
	public static void main(String args[ ])
	{
		String str = new String();
		char ch='a';
		int len,count=0;
	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);

		try
		{
			System.out.print("Enter String : ");
			str = br.readLine();
			System.out.print("Enter a character to br searched in string : ");
			ch = (char)br.read();
			System.out.println(" String is : "+str);
			
		}
		catch(Exception e) 		
		{  
		System.out.println("I/O Error");  
		 }

		len = str.length();
		for(int i =0;i<=len-1;i++)
			if(ch==str.charAt(i))
				count++;

		System.out.println(" Frequency of character '"+ch+"' in string is "+count);
	}
}