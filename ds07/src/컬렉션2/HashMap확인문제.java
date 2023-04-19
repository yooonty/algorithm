package 컬렉션2;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "apple", "banana", "melon", "apple" };
		HashMap<String, Integer> map = new HashMap<>();

		for (String x : fruits) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		System.out.println(map);

		int maxValue = 0;
		String maxKey = "";
		for (String x : map.keySet()) {
			if (map.get(x) > maxValue) {
				maxValue = map.get(x);
				maxKey = x;
			}
		}
		System.out.println(maxKey + "의 득표수 : " + maxValue);
		System.out.println(map.keySet());

	}

}
