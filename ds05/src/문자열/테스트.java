package 문자열;

import java.util.*;
import java.util.stream.Collectors;

public class 테스트 {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 1; i <= 24; i++) {
//			if (24 % i == 0) {
//				list.add(i);
//			}
//		}
//		System.out.println(list);
//		int[] result = list.stream().mapToInt(x->x).toArray();
//		System.out.println(Arrays.toString(result));
		for (int i = 4; i < 2; i++) {
			System.out.println("gggg");
		}
		String s[] = {};
		String s2 = Arrays.stream(s).distinct().collect(Collectors.joining());
		System.out.println(s2);
		
	}

}
