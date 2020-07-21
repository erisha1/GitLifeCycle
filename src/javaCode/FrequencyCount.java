package javaCode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FrequencyCount {

	public static void main(String[] args) {
		String str = "selenium";
		char[] arr = str.toCharArray();
		int size = arr.length;

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int i = 0;
		while (i != size) {
			Integer count = map.get(arr[i]);
			if (count == null) {
				map.put(arr[i], 1);
			} else
				map.put(arr[i], ++count);
			++i;
		}
		Set<Entry<Character, Integer>> hmap = map.entrySet();

		for (Entry<Character, Integer> data : hmap) {
			System.out.print(data.getKey());
			System.out.println(data.getValue());
		}

	}

}
