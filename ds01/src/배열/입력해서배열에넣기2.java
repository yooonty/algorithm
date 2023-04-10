package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 자바프로그램과 콘솔(키보드)를 Stream(강물) open
		double[] numbers = new double[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble(); // 입력받아서, int로 바꾼후, 배열에 넣어라!
		}
		sc.close(); // stream close

		for (int i = 0; i < numbers.length; i++) {
			double x1 = 22.2;
			double x2 = 33.3;
			if (numbers[i] == x1) {
				System.out.println(x1 + "위치: " + i);
			}
			if (numbers[i] == x2) {
				System.out.println(x2 + "위치: " + i);
			}
		}

	}

}
