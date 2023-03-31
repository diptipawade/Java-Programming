class FinallyBlock
{

	public static void main(String args[])
	{
	
           System.out.println("\n\nFinally blk always get excute whether or not exception thrown");


          try{
              System.out.println("\n\nLock system resources like printer or database tables in try block.");
	      System.out.println("But dont unlock them inside try.......");
	     }

	  catch(Exception e)
	     {
	      System.out.println("Nor even inside catch.........");
	     }  	

	  finally
	     {
              System.out.println("\n\nIt is better to unlock resourses in finally");
             }

	  System.out.println("\n\n********End*******");
   	     
	}
}