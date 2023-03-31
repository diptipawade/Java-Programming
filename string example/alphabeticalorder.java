/* Program to read a string and rewrite it in alphabetical order  */

import java.io.*;    

class P27
{
	public static void main(String args[ ])
	{
		String str=new String();
		char c[] = new char[15];
		char temp;
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
		   for (int j=i+1; j<=len-1; j++)
		   {
		      if (c[i] > c[j])
               	      {
                    	   temp = c[i];
               		   c[i] = c[j];
               		   c[j] = temp;
         	      }          
      		   } 

		System.out.println(" Sorted String is : ");  
		for(int i=0;i<=len-1;i++)
			System.out.print(c[i]);                 
	}
}

