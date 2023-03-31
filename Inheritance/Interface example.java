interface Area  //interface defined
{
	float pi=3.14F;
	float compute(float x, float y);
}

class Rectangle implements Area
{
public float compute (float x, float y)
{
return(x*y);
}

}

class Circle implements Area
{
public float compute(float x, float y)
{
return(pi*x*x);
}
}
class InterfaceTest2
{
public static void main(String args[])
{
Rectangle rect=new Rectangle();
Circle cir=new Circle();
Area a;
a=rect;
System.out.println("Area of rectangle : "+a.compute(5,10));
a=cir;
System.out.println("Area of circle : "+a.compute(5,0));

}
}
/*
Area of rectangle : 50.0
Area of circle : 78.5
*/