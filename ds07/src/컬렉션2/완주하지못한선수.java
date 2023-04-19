package 컬렉션2;

import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden", "eden"};
		String[] completion = { "kiki", "eden", "leo" };

		HashMap<String, Integer> map = new HashMap<>();
		for (String x : participant) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		System.out.println(map);
		for (String x : completion) {
			map.put(x, map.get(x) - 1);
		}
		String fail = "";
		for (String x : map.keySet()) {
			if(map.get(x)!=0) {
				fail = x;
				break;
			}
		}
		System.out.println(fail);

	}

}
