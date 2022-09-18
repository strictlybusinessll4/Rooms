public class LightRoom extends RoomDecorator
{

	public LightRoom(IRoom room)
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
		System.out.println(super.name + ' ' + description);	
	}
}
