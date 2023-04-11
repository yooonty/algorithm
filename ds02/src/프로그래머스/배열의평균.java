package 프로그래머스;

public class 배열의평균 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double answer = sol.solution(numbers);
		System.out.println(answer);

	}

}

class Solution3 {
	public double solution(int[] numbers) {
		double sum = 0;
		for (int x : numbers) {
			sum += x;
		}
		return sum / numbers.length;
	}
}
