import java.util.Scanner;

class MatrixOp
{
int m,n;
int mat[][];

void read()
{
int i,j;
Scanner sr=new Scanner(System.in);
int z=0;
do
{
if(z>0)
{
System.out.println("The no. of rows and columns should be same");
}
System.out.println("Enter the number of rows");
m=sr.nextInt();

System.out.println("Enter the number of columns");
n=sr.nextInt();

z++;
}while(m!=n);


mat=new int[m][n];

System.out.println();
System.out.println("Enter the matrix values:");

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println("Enter the value of mat["+i+"]["+j+"]");
mat[i][j]=sr.nextInt();
}
}

}

void display()
{
int i,j;
System.out.println("Matrix is:\n");
for(i=0;i<mat.length;i++)
{
for(j=0;j<mat[i].length;j++)
{
System.out.print(mat[i][j]+"\t");
}
System.out.println();
}

}

boolean isNull()
{
int i,j;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(mat[i][j]!=0)
{
return false;
}
}
}
return true;

}

boolean isUnit()
{
int i,j;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(i==j && mat[i][j]!=1)
{
return false;
}
else if(i!=j && mat[i][j]!=0)
{
return false;
}
}
}
return true;

}


}


class Matrix
{
public static void main(String args[])
{
boolean s,s1;
MatrixOp mo=new MatrixOp();
mo.read();
System.out.println();
mo.display();
s=mo.isNull();
if(s)
{
System.out.println("The given matrix is a null matrix");
}
else
{
System.out.println("The given matrix is not a null matrix");
}

s1=mo.isUnit();
if(s1)
{
System.out.println("The given matrix is a unit matrix");
}
else
{
System.out.println("The given matrix is not a unit matrix");
}


}
}
