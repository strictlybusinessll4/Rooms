public abstract class RoomDecorator implements IRoom
{
	protected String description;
	protected String name;
	//private boolean isLight;	
        private final IRoom room;	
	public RoomDecorator(IRoom room)
	{
		this.room = room;
	}
	
	public void setDescription(String description)
	{
		room.setDescription(description);
	}


	public void setName(String name)
	{
		room.setName(name);
	}

	public void printInfo()
	{
		room.printInfo();
	}
}
		
	
