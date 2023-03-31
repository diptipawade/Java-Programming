import java.io.*;

class MyException extends Exception
 {
public MyException(String msg)
{
super(msg);
}
}

class Test2
{
 public static void main(String[] args)throws IOException 
{

InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader stdin=new BufferedReader(isr);
  	try {
	     System.out.println("Enter your Mark\n");
	  
	     int mrk=Integer.parseInt(stdin.readLine());
	   
	     if(mrk<0 || mrk>100) 
                      {
	       throw new MyException("Marks should be in the range 0-100");
  	      }
	     System.out.println("Your mark: "+mrk);
	    }
	catch (MyException exc)
	     {
	         System.out.println("\nNow this is my own exception message\n");
	         exc.printStackTrace();
  	     }
  }
}
