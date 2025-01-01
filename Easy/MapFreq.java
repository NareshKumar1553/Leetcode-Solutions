package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFreq {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(5);
		a.add(7);
		a.add(2);
		Map<Integer,Integer> map = new TreeMap<>();
		
		for(Integer i : a) {
			Integer k = map.get(i);
			map.put(i, (k == null)?1:k+1);
		}
		
		int max = Collections.max(map.values());
		for(Map.Entry<Integer,Integer> m: map.entrySet()) {
			if(m.getValue() == max)
			System.out.println(m.getKey()+"-"+m.getValue());
		}
		System.out.println(map.size());
	}

}
