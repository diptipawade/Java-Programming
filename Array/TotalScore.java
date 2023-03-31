import java.util.Scanner;

class TotalScore
{
public static void main(String args[])
{
Scanner sr=new Scanner(System.in);

System.out.println("Enter the number of players");
int n=sr.nextInt();

int match[][]=new int[n][];

for(int i=0;i<match.length;i++)
{
int total=0;
double avg=0;
System.out.println("\nEnter the number of matches played by player "+(i+1));
int num=sr.nextInt();

match[i]=new int[num];

for(int j=0;j<match[i].length;j++)
{
System.out.println("\nEnter the runs scored by player "+(i+1)+" in match "+(j+1));
match[i][j]=sr.nextInt();

total=total+match[i][j];
}

avg=(double)total/match[i].length;

System.out.println("\nThe total runs scored by player "+(i+1)+" is "+total);
System.out.println("The average runs scored by player "+(i+1)+" is "+avg);
}

}
}