package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수3_중복O_정렬O {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int k = sc.nextInt();

		// TreeSet<-3,4,5,1,2
		TreeSet<Integer> set = new TreeSet<>(); // 오름차순
		// TreeSet<Integer> ts2 = new TreeSet<>(Collections.reverseOrder()); // 내림차순

		for (int i = 0; i < size; i++) {
			set.add(sc.nextInt());
		}
		System.out.println(set);
		Object[] result = set.toArray();
		System.out.println(result[result.length - k]);
	}

}
