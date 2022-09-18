import java.util.Scanner;

public class mainClass
{
	public static void main(String[] args)
	{
	      	int size;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Start with a Size");
		size = s.nextInt();
		Scanner type = new Scanner(System.in);

		//Linked List //Create Default Room and everything Connects
		//Math.random()*(4-1)+1
		//From there

		IRoom defaultRoom = new Room();
		defaultRoom = new LightRoom(defaultRoom);
		defaultRoom.setDescription("A Default Room");
		defaultRoom.setName("The Starting Room");


		IRoom branchStart = new Room();
		branchStart = new LightRoom(branchStart);
		//defaultRoom.S = branchStart;

		for(int i = 0; i < size; i++)
		{
			System.out.println("Pick 1 for a light room, Pick 2 for a dark room");


			int choice = s.nextInt();

			
			Scanner strings = new Scanner(System.in);
			IRoom roomTemplate = new Room();
			if(choice == 1)
			{
				System.out.println("Fill in the Name and Description of the Light room");
				System.out.print("Name - ");
				roomTemplate.setName(strings.next());
				System.out.println();
				System.out.print("Description - ");
				roomTemplate.setDescription(strings.next());
				System.out.println();
				System.out.println("Room " + i + " Set");

				
			
				
				roomTemplate = new LightRoom(roomTemplate);


			
			} else {

				roomTemplate = new DarkRoom(roomTemplate);
			}
				

		}	
	
	}
}


