package 컬렉션2;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] num = { 1, 3, 4, 5, 2 };
		int k = 2;
		// 일단 정렬해라!
		// 정렬한 데이터 중에서 2번재 위치를 찾을 것.
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(num[1]);
		System.out.println(k + "번째 큰 수: " + num[num.length - k]);
	}

}
