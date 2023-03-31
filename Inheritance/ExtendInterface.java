interface NewShape
{
	void draw();
}

interface Circle extends NewShape
{
	void getRadius();
	int radious=10;
}

class NewCircle implements Circle
{
	public void getRadius()
	{
		System.out.println(radious);
	}
}
class ExtendInterface extends NewCircle
{
	public static void main(String args[])
	{
		Circle nc=new NewCircle();
		nc.getRadius();
	}
}


		 //NewCircle is not abstract and does not override abstract method draw() in NewShape