package basics.programms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindOccurance {
	public static void main(String[] args) {
		String str = "I, m indian citizen . . I live in india . india has 27 states";
		String[] words = str.split("\\s");
		HashMap<String, Integer> hs = new HashMap();
		for (String word : words) {
			System.out.println(word);
			if (hs.containsKey(word))
				hs.put(word, hs.get(word) + 1);
			else
				hs.put(word, 1);
		}
		System.out.println(hs);
		Set<Entry<String, Integer>> entries = hs.entrySet();
		for (Entry<String, Integer> Entry : entries) {
			System.out.println(Entry.getKey() + "    " + Entry.getValue());
		}
      System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		TreeMap<String, Integer> t = new TreeMap(hs);
		Set<Entry<String, Integer>> entries1 = t.entrySet();
		for(Entry<String,Integer>f:entries1)
		{
			System.out.println(f.getKey()+"  "+f.getValue());
		}

	}
}
