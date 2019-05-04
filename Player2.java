import java.io.File;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

public class Player2 {
	private Object player;

	
	public Player2(Object player){
	this.player = player;
	}
	
/*
 * Not sure what  field is username yet just guessing aString10197
 */
	public String getUserName() throws IllegalArgumentException, IllegalAccessException, MalformedURLException, ClassNotFoundException, NoSuchFieldException, SecurityException {
		File file = new File("C:\\Users\\accen\\Desktop\\718\\Matrix Package\\Matrix Client\\bin");
		URL url = file.toURI().toURL();
		URL[] urls = {url};
		ClassLoader loader = new URLClassLoader(urls);
		Class myClass = loader.loadClass("Player");
		Field f = myClass.getDeclaredField("aString10195");
		f.setAccessible(true);
		System.out.println(f.get(player));
	return (String) f.get(player);
	}
}
	


