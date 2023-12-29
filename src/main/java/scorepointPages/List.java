package scorepointPages;
import java.util.ArrayList;
public class List {
	public static java.util.List<String> of(String...args){
		java.util.List<String> ls = new ArrayList<String>();
		for(String s : args) {
			ls.add(s);
		}
		return ls;
	}
}
