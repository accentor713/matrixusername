import java.net.MalformedURLException;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, MalformedURLException {
		
		for(Player2 player : getLoaded())
		{
			System.out.println(player);
		}
		
	}	
	public static Player2[] getLoaded() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, MalformedURLException {

			ArrayList<Player2> players = new ArrayList<Player2>();
			
		 Object[] oPlayers = Reflection1.getPlayerArray(); //Assuming the player array method is stored in the class client
		// System.out.println(oPlayers.length);
		 int i = 0;
			for(Object o : oPlayers) {
				if(o != null) {
				System.out.println("o != null");
				Player2 cur = new Player2(o);
				System.out.println(cur);
				players.add(cur);
			}
				System.out.println( i + " " + "o = null");
				i++;
			}
			
			return players.toArray(new Player2[players.size()]);
	}
	}
		// TODO Auto-generated method stub
		


	
