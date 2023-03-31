import java.util.Scanner;

class DiagonalElementSum
{
public static void main(String args[])
{
int m[][];
int r,i,j;
int sum=0;

Scanner sr=new Scanner(System.in);

System.out.println("Enter the order of the square matrix");
r=sr.nextInt();

m=new int[r][r];

System.out.println();
for(i=0;i<r;i++)
{
for(j=0;j<r;j++)
{
System.out.println("Enter a number");
m[i][j]=sr.nextInt();
}
}

System.out.println("\n The Matrix is");

for(i=0;i<m.length;i++)
{
for(j=0;j<m[i].length;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}

for(i=0;i<r;i++)
{
for(j=0;j<r;j++)
{
if(i==j)
{
sum=sum+m[i][j];
}
}
}

System.out.println("The sum of the diagonal elements is "+sum);


}
}