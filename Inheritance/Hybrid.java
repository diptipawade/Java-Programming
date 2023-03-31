class student
{
	int roll_number;
		void get_number(int a)
		{
				roll_number = a;
        }
        void put_number()
        {
                System.out.println("Roll No.  : "+roll_number);
        }
}

class test extends student
{

       	float sem1, sem2;
	    void get_marks (float s1, float s2)
        {
                sem1 = s1;
                sem2 =  s2;
        }
        void put_marks()
        {
                 System.out.println("Marks obtained  : ");
                 System.out.println("Sem1 = "+sem1);
                 System.out.println("Sem2 = "+sem2);
        }
}

interface sports
{
        float score=6.0F;
        void put_score();

}

class Result extends test implements sports
{
		float total;
        void display()
        {
			total = sem1 + sem2 + score;
			put_number( );
			put_marks( );
			put_score( );
			System.out.println("Total Marks : "+total);
		}
	    public void put_score()
        {
                 System.out.println("Sports weight : "+score);
        }

}


class Hybrid
{
public static void main(String args[])
{
Result R1=new Result();
R1.get_number(123);
R1.get_marks(1200,1000);

R1.display( );
}
}
/*
Roll No.  : 123
Marks obtained  :
Sem1 = 1200.0
Sem2 = 1000.0
Sports weight : 6.0
Total Marks : 2206.0
*/