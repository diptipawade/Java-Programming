import java.util.Scanner;

class MatrixSearch
{
public static void main(String args[])
{
int m[][];
int r,i,j,ele;

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

int flag=0;

System.out.println("\n Enter the element to be searched");
ele=sr.nextInt();

System.out.println();

out:for(i=0;i<r;i++)
{
for(j=0;j<r;j++)
{
if(m[i][j]==ele)
{
System.out.println("The element is found at m["+i+"]["+j+"]");
flag=1;
break out;
}
}
}

if(flag==0)
{
System.out.println("Element not found");
}

}
}