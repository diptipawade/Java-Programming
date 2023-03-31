class FinallyBlock
{

	public static void main(String args[])
	{
	
          int cmdlinelen=args.length;
	  System.out.println("\nCommand line lenght=" + cmdlinelen);

	      
	  try
	     {
		int b=42/cmdlinelen;
		int c[]={11,12,13};
		c[3]=14;
	     }

          catch(ArithmeticException e)
	     {
             	System.out.println("\nDivide by Zero Error.");
   	     }

          catch(ArrayIndexOutOfBoundsException e)
	     {
             	System.out.println("\nYou are accessing wrong elements.");
   	     }

	  System.out.println("\n\n********End*******");
   	     
	}
}