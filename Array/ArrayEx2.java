import java.util.Scanner;

class ArrayEx2
{
public static void main(String args[])
{

//initializing the array statically

int p[][]={{2,3,4,5},{6,7,8,9},{10,11,12,13}};
int i,j;

System.out.println();
System.out.println("There are "+p.length+" rows");
System.out.println("There are "+p[0].length+" columns"+" for row 1");

for(i=0;i<p.length;i++)
{
for(j=0;j<p[i].length;j++)
{
System.out.print(p[i][j]+"\t");
}
System.out.println();
}

System.out.println("----------------------------------------\n");

//initializing the array dynamically

int r[][];
r=new int[2][3];

System.out.println("Matrix r is:\n");
for(i=0;i<r.length;i++)
{
for(j=0;j<r[i].length;j++)
{
System.out.print(r[i][j]+"\t");
}
System.out.println();
}

System.out.println("----------------------------------------\n");

//Accepting the values of the matrix from the user

Scanner sr=new Scanner(System.in);
int m,n;

System.out.println("Enter the number of rows");
m=sr.nextInt();

System.out.println("Enter the number of columns");
n=sr.nextInt();

int s[][]=new int[m][n];

System.out.println();
System.out.println("Enter the matrix values:");

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println("Enter the value of s["+i+"]["+j+"]");
s[i][j]=sr.nextInt();
}
}

System.out.println();
System.out.println("Matrix s is:\n");
for(i=0;i<s.length;i++)
{
for(j=0;j<s[i].length;j++)
{
System.out.print(s[i][j]+"\t");
}
System.out.println();
}

}
}

/*
 OUTPUT
 
 
There are 3 rows
There are 4 columns for row 1
2       3       4       5
6       7       8       9
10      11      12      13
----------------------------------------

Matrix r is:

0       0       0
0       0       0
----------------------------------------

Enter the number of rows
2
Enter the number of columns
3

Enter the matrix values:
Enter the value of s[0][0]
12
Enter the value of s[0][1]
23
Enter the value of s[0][2]
45
Enter the value of s[1][0]
56
Enter the value of s[1][1]
67
Enter the value of s[1][2]
78

Matrix s is:

12      23      45
56      67      78
Press any key to continue...

*/