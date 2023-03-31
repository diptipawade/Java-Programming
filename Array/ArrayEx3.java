import java.util.Scanner;

class ArrayEx3
{
public static void main(String args[])
{

//creating a static jagged array

int q[][]={{1,2,3},{4,5},{2,3}};
int i,j;

System.out.println("Matrix q is:\n");
for(i=0;i<q.length;i++)
{
for(j=0;j<q[i].length;j++)
{
System.out.print(q[i][j]+"\t");
}
System.out.println();
}

System.out.println("There are "+q.length+" rows");
System.out.println("Row 2 has "+q[2].length+" columns");

System.out.println("----------------------------------------\n");

//creating jagged array dynamically and accepting the values from the user

Scanner sr=new Scanner(System.in);
int r,c;

System.out.println("Enter the number of rows");
r=sr.nextInt();

int d[][]=new int[r][];

System.out.println("\nd[0]="+d[0]);
for(i=0;i<d.length;i++)
{
System.out.println();
System.out.println("Enter the number of columns for row "+(i+1));
c=sr.nextInt();
d[i]=new int[c];

for(j=0;j<d[i].length;j++)
{
System.out.println("Enter the values for row "+(i+1)+",column "+(j+1));
d[i][j]=sr.nextInt();
}

}

System.out.println();

for(i=0;i<d.length;i++)
{
for(j=0;j<d[i].length;j++)
{
System.out.print(d[i][j]+"\t");
}
System.out.println();
}

}
}

/*
 OUTPUT
 
 Matrix q is:

1       2       3
4       5
2       3
There are 3 rows
Row 2 has 2 columns
----------------------------------------

Enter the number of rows
4

d[0]=null

Enter the number of columns for row 1
1
Enter the values for row 1,column 1
22

Enter the number of columns for row 2
2
Enter the values for row 2,column 1
45
Enter the values for row 2,column 2
89

Enter the number of columns for row 3
3
Enter the values for row 3,column 1
23
Enter the values for row 3,column 2
45
Enter the values for row 3,column 3
33

Enter the number of columns for row 4
4
Enter the values for row 4,column 1
67
Enter the values for row 4,column 2
34
Enter the values for row 4,column 3
89
Enter the values for row 4,column 4
11

22
45      89
23      45      33
67      34      89      11
Press any key to continue...

*/