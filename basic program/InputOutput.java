    import java.io.*;

	class InputOutput
	{
	
	  public static void main(String args[]) throws IOException
	    {

	      InputStreamReader isr=new InputStreamReader(System.in);
	      BufferedReader stdin=new BufferedReader(isr);

	      System.out.println("\nEnter Your Name:");
	      String name=stdin.readLine();


	      System.out.println("\nEnter Your Employee Number:");
	      int eno=Integer.parseInt(stdin.readLine());


 	      System.out.println("\nEnter Your Salary:");
	      double sal=Double.parse(Doublestdin.readLine());

	      System.out.println("Your name:  "+name);
	      System.out.println("Your ENO:   "+eno);
	      System.out.println("Your salary: "+sal);

	    }
    }