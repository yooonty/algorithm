package 배열;

public class 배열최솟값구하기1 {

	public static void main(String[] args) {
		int[] s = { 90, 80, 20, 70, 60 };
		int min = s[0];
		for (int x : s) {
			if (min > x) {
				min = x;
			}
		}
		System.out.println(min);
	}

}
