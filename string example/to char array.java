/* Program to display the elements of string with their element nos.  */

import java.io.*;            

class P25
{
	public static void main(String args[ ])
	{
		String str=new String();
		char c[] = new char[15];
		int len=0;	
     InputStreamReader isr=new InputStreamReader(System.in);
	 BufferedReader br=new BufferedReader(isr);
		try
		{
		     System.out.print(" Enter String : ");
		     str = br.readLine();
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		len=str.length();
		c = str.toCharArray();
		for(int i=0;i<=len-1;i++)
		      System.out.println(" Element["+i+"] : "+c[i]);
	}
}