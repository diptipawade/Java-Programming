//super class
class Person
{
	 String name;
	 int code;

	Person(String n,int c)
	{
		name=n;
		code=c;
	}
	void put_namecoade( )
	{
		System.out.println("\n Name of person is: "+name);
		System.out.println("\n Code is: "+code);
	}
}

//intermediate super class
class Account extends Person
{
	 int pay;

	Account(String n,int c,int p)
	{
		super(n,c);
		pay=p;
	}

	void put_pay( )
	{
		put_namecoade();
		System.out.println("\n Salary : "+pay);
	}
}

//suub class
class Admin extends Account
{
 int exp;

	Admin(String n,int c,int p,int e)
	{
		super(n,c,p);
		exp=e;
	}

	void put_exp( )
	{
		put_pay();
		System.out.println("\n Experience : "+exp);
	}

}

class CompanyRecords
{

public static void main( String args[])
{
 Admin m=new Admin("Akshay",1001,10000,5);
 m.put_exp( );
}
}
/*
 Name of person is: Akshay

 Code is: 1001

 Salary : 10000

 Experience : 5
*/