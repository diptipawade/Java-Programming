class Room
{
	int length,breadth;
	Room(int x, int y)
	{
		length=x;
		breadth=y;
	}
	int area()
	{
		return(length*breadth);
	}
}
 
 
 class BedRoom extends Room
 {
 	int height;
 	BedRoom(int x, int y, int z)
 	{
 		super(x,y);
 		height=z;
 	}
 	int volume()
 	{
 		return(length*breadth*height);
 	}
 }
 
 
 class inherTest
 {
 	public static void main(String args[])
 	{
 		BedRoom room1=new BedRoom(14,12,10);
 		int area1=room1.area();
 		int volume1=room1.volume();
 		System.out.println("area1=:"+area1);
 		System.out.println("volume=:"+volume1);
 	}
 }