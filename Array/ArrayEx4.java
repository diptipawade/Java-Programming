import java.io.*;

class ArrayEx4
{
public static void main(String args[]) throws IOException
{

//creating 1D String array statically

String s[]={"Henin","Roger","Maria","Samantha"};
int i,j;

System.out.println("1D String array:");
System.out.println("----------------");

for(i=0;i<s.length;i++)
{
System.out.println(s[i]);
}

System.out.println("---------------------------------------");

//creating 2D String array statically

String name[][]={{"Henin","Roger"},{"Maria","Samantha"}};

System.out.println("2D String array:");
System.out.println("----------------");

for(i=0;i<name.length;i++)
{
for(j=0;j<name[i].length;j++)
{
System.out.print(name[i][j]+"\t");
}
System.out.println();
}

//creating 1D String array dynamically

String str[]=new String[3];

System.out.println("\n Array 'str' is:");
for(i=0;i<str.length;i++)
{
System.out.println(str[i]);
}

System.out.println("---------------------------------------\n");

//Accepting the string from the user

InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String c;
int n;

System.out.println("how many strings do you want to enter?");
c=br.readLine();
n=Integer.parseInt(c);

String ss[]=new String[n];


System.out.println();
for(i=0;i<ss.length;i++)
{
System.out.println("Enter String "+(i+1));
ss[i]=br.readLine();
}

System.out.println("\n After accepting the values 'ss' is:");

for(i=0;i<ss.length;i++)
{
System.out.println(ss[i]);
}

}
}


/*
 OUTPUT
 
 1D String array:
----------------
Henin
Roger
Maria
Samantha
---------------------------------------
2D String array:
----------------
Henin   Roger
Maria   Samantha

 Array 'str' is:
null
null
null
---------------------------------------

how many strings do you want to enter?
2

Enter String 1
Java
Enter String 2
Workshop

 After accepting the values 'ss' is:
Java
Workshop
Press any key to continue...

*/