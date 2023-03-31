import java.util.Scanner;

class Account
{
int accid;
double balance;

Account()
{
Scanner sr=new Scanner(System.in);

System.out.println("Enter your account id");
accid=sr.nextInt();

System.out.println("Enter the balance in your account");
balance=sr.nextDouble();
}

boolean search(int a)
{
if(accid==a)
{
return true;
}
else
{
return false;
}

}


void print()
{
System.out.println("The balance of the account holder with account id "+accid+" is "+balance);
}

}

class AccountInfo
{
public static void main(String args[])
{

Scanner sr=new Scanner(System.in);
int n,i,aa;

System.out.println("Enter the number of account holders");
n=sr.nextInt();

Account ac[]=new Account[n];

for(i=0;i<n;i++)
{
System.out.println(ac[i]+" ");
}

for(i=0;i<n;i++)
{
ac[i]=new Account();
}

System.out.println("The Account holders data is:");
for(i=0;i<n;i++)
{
ac[i].print();
}

System.out.println("Enter your account id:");
aa=sr.nextInt();

int flag=0;

for(i=0;i<n;i++)
{
boolean s=ac[i].search(aa);

if(s)
{
ac[i].print();
flag=1;
break;
}

}

if(flag==0)
{
System.out.println("The account id does not exist");
}

}
}

/*
 
 OUTPUT
 
 Enter the number of account holders
3
null
null
null
Enter your account id
123
Enter the balance in your account
4000000
Enter your account id
124
Enter the balance in your account
5000
Enter your account id
125
Enter the balance in your account
1000
The Account holders data is:
The balance of the account holder with account id 123 is 4000000.0
The balance of the account holder with account id 124 is 5000.0
The balance of the account holder with account id 125 is 1000.0
Enter your account id:
124
The balance of the account holder with account id 124 is 5.0E7
Press any key to continue...

*/