/* Program to sort a list of sir names   */

import java.io.*;      

class P28
{
	public static void main(String args[ ])
	{
		String str[]=new String[5];
		int i,j,len=0;
		InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);

	

		try
		{
		     for(i=0;i<5;i++)
		     {
		         System.out.print(" Enter Sirname of Student "+(i+1)+" : ");
		         str[i] = br.readLine();
		     }
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		System.out.println(" Sorted list is : ");
		for(j =0;j<str.length;j++)
		{
			for(i = j+1;i<str.length;i++)
			{
				if(str[i].compareTo(str[j])<0)
				{
					String t=str[j];
					str[j]=str[i];
					str[i]=t;
				}
			}
			System.out.println(str[j]);
		}
	}
}
 