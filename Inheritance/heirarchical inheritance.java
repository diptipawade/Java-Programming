
class staff
{

      int code;
     String name;
     String address;

	staff(int c,String n,String a)
	{
		code=c;
		name=n;
		address=a;
	}

	void showdata()
	{
		  System.out.println("Code = "+code);
          System.out.println("Name = "+name);
          System.out.println("Address = "+address);
	}
}


class teacher extends staff
{
		String subject;
	 String publication;

	teacher(int c,String n,String a,String s,String p)
	{
		super(c,n,a);
		subject=s;
		publication=p;
	}

	void showdata()
	{
		super.showdata();
		System.out.println("Subject = "+subject);
		System.out.println("Publication = "+publication);
	}
}

class officer extends staff
{
	String grade;

	officer(int c,String n,String a,String g)
	{
		super(c,n,a);
		grade=g;
	}

	void showdata()
	{
		super.showdata();
		System.out.println("Grade = "+grade);
	}
}



class Employees
{

public static void main(String args[])
{
 
 officer o=new officer(2001,"Shrikanth","Dadar","A");
 teacher t=new teacher(3001,"Smita","Parel","Maths","Tect-Max Publications");
 
 
 o.showdata();
 t.showdata();
 
}
}
