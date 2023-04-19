package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째작은수 {

	public static void main(String[] args) {
		// 배열 이욯
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int k = sc.nextInt();

		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));

		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(k + "번째 작은 수: " + num[k - 1]);
	}

}
