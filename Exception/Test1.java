import java.io.*;

class MyException extends Exception
 {
public MyException(String msg)
{
super(msg);
}
}

class Test1
{
 public static void main(String[] args)throws IOException 
{

InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader stdin=new BufferedReader(isr);
  	try {
	     System.out.println("Enter two numbers\n");
	  
	     int first=Integer.parseInt(stdin.readLine());
	    int second=Integer.parseInt(stdin.readLine());  
	     if(second==0) 
                      {
	       throw new MyException("can't be divided by zero");
  	      }
	     System.out.println("Result=" + (first/second));
	    }
	catch (MyException exc)
	     {
	         System.out.println("\nNow this is my own exception message\n");
	         exc.printStackTrace();
  	     }
  }
}
