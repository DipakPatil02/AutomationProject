package shinsaiten.utils;
import java.util.HashMap;
import java.util.Map;
public class RuntimeUtils {
	public Map<String,String> map = new HashMap<String,String>();
	public RuntimeUtils() {
	}
	public void addRuntimeVariable(String key, String value) {
		map.put(key, value);
	}
	public String getRunTimeValue(String key) {
		return map.containsKey(key)?map.get(key):null;
	}
}
