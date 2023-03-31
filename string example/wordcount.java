import java.io.*;
import java.util.*;

public class wordcount

{
	public static void main(String[] args) throws IOException
	{
		String s;
		int count;
	
		
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		
		s=b.readLine();		
		
		count =1;
		
		for (int i=0;i<s.length() ;i++ )
		{
			

			
			if (i!=0)
			{
				
				if (s.charAt(i)!=' ' && s.charAt(i-1) ==' ')
				{
					count++;
				}
		
			}
		}
		
		System.out.println(count);
		
	}
}
/*Enter the string
smita sheetal poonam rohini bhakti
5*/
