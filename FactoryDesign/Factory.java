import java.util.Math

public class Factory implements IFactory
{
	public IRoom makeRoomType()
	{
		int probabilityDecider = (int)Math.random()*100;
		if (probabilityDecider > 50)
		{
			return new LightRoom();
		} else {
			return new DarkRoom();
		}
				
	}



}
