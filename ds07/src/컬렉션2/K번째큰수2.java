package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int k = sc.nextInt();

		// TreeSet<-3,4,5,1,2
		TreeSet<Integer> ts = new TreeSet<>(); // 오름차순
		// TreeSet<Integer> ts2 = new TreeSet<>(Collections.reverseOrder()); // 내림차순
		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));

		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(k + "번째 큰 수: " + num[num.length - k]);
	}

}
