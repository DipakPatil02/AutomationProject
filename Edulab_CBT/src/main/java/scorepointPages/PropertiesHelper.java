package scorepointPages;
import java.io.FileInputStream;
import java.util.Properties;
public class PropertiesHelper {
	public static Properties globalProperties ;
	public static Properties envProperties ;
	static {
		try {
			getGlobalProperties();
			envProperties = new Properties();
			envProperties.load(new FileInputStream(
					System.getProperty("user.dir")+"/env/"+globalProperties.getProperty("env")+".properties"));
			//envProperties.load(new FileInputStream(System.getProperty("user.dir")+"/env/master.properties"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void getGlobalProperties() {
		try {
			globalProperties = new Properties();
			globalProperties.load(new FileInputStream(System.getProperty("user.dir")+"/config/config.properties"));
			//envProperties.load(new FileInputStream(System.getProperty("user.dir")+"/env/master.properties"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
