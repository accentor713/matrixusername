import java.io.File;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Reflection1 {
	public static Object[] getPlayerArray() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, MalformedURLException {
		File file = new File("C:\\Users\\accen\\Desktop\\718\\Matrix Package\\Matrix Client\\bin");
		URL url = file.toURI().toURL();
		URL[] urls = {url};
		ClassLoader loader = new URLClassLoader(urls);
		Class myClass = loader.loadClass("client");
		System.out.println(myClass.getName());
	
		Field field1 = myClass.getDeclaredField("aClass365_Sub1_Sub1_Sub2_Sub2Array8805");//Believe this holds the players that are logged into server
		field1.setAccessible(true);
		Object[] players = (Object[]) field1.get(null);
		System.out.println(players.length); // it is set to 2048 in the client class
		// should return a player Object
		
		return (Object[]) field1.get(null);// returns 2048 null value
	}
	
}
