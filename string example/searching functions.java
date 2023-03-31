/* Program to demonstrates the - indexOf() and lastIndexOf() */

class indexOfDemo
{
     public static void main(String args[ ])
     {
	 String s = "Java is object oriented and dynamic Language, and "+
		"it can be used to create two types of programs: applications and applets.";
	 
	 System.out.println("Original String is :");
	 System.out.println(s);

	 System.out.println("\nindexOf(t)="+s.indexOf('t'));
	 System.out.println("\nlastIndexOf(t)="+s.lastIndexOf('t'));
	 System.out.println("\nindexOf(and)="+s.indexOf("and"));
	 System.out.println("\nlastIndexOf(and)="+s.lastIndexOf("and"));

	 System.out.println("\nindexOf(t,16)="+s.indexOf('t',16));
	 System.out.println("\nlastIndexOf(t,111)="+s.lastIndexOf('t',111));
	 System.out.println("\nindexOf(and,30)="+s.indexOf("and",30));
	 System.out.println("\nlastIndexOf(and,99)="+s.lastIndexOf("and",99));

	}
}
