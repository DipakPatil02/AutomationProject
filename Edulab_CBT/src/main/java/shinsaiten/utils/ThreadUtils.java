package shinsaiten.utils;
public class ThreadUtils {
	public static void appWait(long value) {
		try {
			Thread.sleep(value);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
