package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째작은수2 {

	public static void main(String[] args) {
		// 배열 이욯
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int k = sc.nextInt();

		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < size; i++) {
			set.add(sc.nextInt());
		}
		System.out.println(set);
		System.out.println(k + "번째 작은 수: " + (int) set.toArray()[k - 1]);
	}

}
