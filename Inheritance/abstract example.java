abstract class Shape
{

	protected double bs,ht,area;
	void getdata(double b, double h)
	{
	bs=b;
	ht=h;
	}
	abstract void displayarea();

}


class Triangle extends Shape
{

	void displayarea()
	{
		area=0.5*bs*ht;
		System.out.println("Area of triangle is : "+area);
	}
}


class Rectangle extends Shape
{

	void displayarea()
	{
	 	area=bs*ht;
	 	System.out.println("Area of rect is : "+area);
	}
}


class Area
{

public static void main(String main[])
{
Triangle t = new Triangle();
Rectangle r =new Rectangle();
t.getdata(3.5,7.5);
t.displayarea();
r.getdata(4,4);
r.displayarea();
}
}

/*
Area of triangle is : 13.125
Area of rect is : 16.0
*/