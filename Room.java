public class Room implements IRoom
{
	//public IRoom N;
	//public IRoom S;
	//public IRoom E;
	//public IRoom W;
	private String description;
	private String name;
	

	public void printInfo()
	{
		System.out.println("The Room is ");
	}

	
        public void setDescription(String description)
	{
		this.description = description;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	

}
