package dec_28;

import java.util.HashMap;
import java.util.Map;

public class SearchKeyInHashMap {

	static void searchKeyInHashMap() {
        Map<String,Integer> m = new HashMap<>();
        m.put("banana", 12);
        m.put("apple",6);
        m.put("grapes", 10);
        m.put("goa", 7);
        String key = "banana";
        if(m.containsKey(key)) {
        	int value = m.get(key);
        	System.out.println("key "+key + "found with value : "+ value);
        }
        else {
        	System.out.println("Key '" + key + "' not found in the HashMap.");
        }
	}

	public static void main(String[] args) {
		searchKeyInHashMap();
	}

}
