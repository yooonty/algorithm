package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		// 1번.
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int min = arr[0];
		for (int x : arr) {
			if (x < min) {
				min = x;
			}
		}
		System.out.println("최소값: " + min);

		// 2번.
		Random r = new Random();
		int[] arr2 = new int[20];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = r.nextInt(900);
		}
		int max = arr2[0];
		for (int x : arr2) {
			if (x > max) {
				max = x;
			}
		}
		System.out.println("최대값: " + max);

		// 3번.
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		System.out.println("두 문자가 동일 한가요? " + s1.equals(s2));
		System.out.println("두 문자의 길이? " + s1.length() + "," + s2.length());
		
		// 4번.
		String s3 = "나는 진짜 java programmer가 되었어";
		System.out.println(s3.substring(6).toUpperCase());
		
		// 5번.
		String s4 = "2056521";
		char gender = s4.charAt(0);
		if (gender == '2') {
			System.out.println("여자입니다.");
		} else {
			System.out.println("남자입니다.");
		}

		// 6, 7번.
		String s5 = "[ 50,20,40,30,10]";
		s5 = s5.replace('[', '\0');
		s5 = s5.replace(']', '\0');
		s5 = s5.trim();
		String[] arr6 = s5.split(",");
		int[] arr7 = new int[arr6.length];
		int sum = 0;
		int num = 0;
		for (int i = 0; i < arr6.length; i++) {
			num = Integer.parseInt(arr6[i]);
			sum += num;
			arr7[i]= num;
		}
		System.out.println("합한 값: " + sum);
		Arrays.sort(arr7);
		System.out.println(Arrays.toString(arr7));
	}

}
