class CaughtException
{

	public static void main(String args[])
	{
		
	   try
	      {
		int d=0;
		int a=42/d;
		System.out.println("i wont be executed because of exception");
	      }

	   catch(ArithmeticException e)
	      {
		System.out.println("Exception has caught.");
		System.out.println("Divide By Zero Error.");
	      }

	   System.out.println("After try and catch statment program will continue Excecution"); 
	   System.out.println("Program has executed completely but there is some lose");
	}
}