public class DarkRoom extends RoomDecorator
{
	public DarkRoom(IRoom room)
	{
		super(room);
	}
	public void setDescription(String description)
	{
		super.setDescription(description);
	}
	public void setName(String name)
	{
		super.setName(name);
	}


	public void printInfo()
	{	
		super.printInfo();
		System.out.println("Dark");
	}
}
