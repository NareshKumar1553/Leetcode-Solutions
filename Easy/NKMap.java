package Easy;

import java.util.HashMap;
import java.util.Map;

public class NKMap {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Naresh", 5);
		map.put("a", 2);
		map.put("a", 3);
		for(Map.Entry <String,Integer> m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue()+" "+m.getClass());
		}
	}
}
