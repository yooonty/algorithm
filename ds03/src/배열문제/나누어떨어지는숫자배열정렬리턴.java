package 배열문제;

import java.util.*;

public class 나누어떨어지는숫자배열정렬리턴 {

	public static void main(String[] args) {
		int[] array = { 5, 9, 7, 10 };
		int divisor = 5;
		Solution4 sol = new Solution4();
		int[] answer = sol.solution(array, divisor);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution4 {
	public int[] solution(int[] array, int divisor) {
		int[] answer = Arrays.stream(array).filter(x -> x % divisor == 0).toArray();
		if (answer.length == 0) {
			answer = new int[1];
			answer[0] = -1; //선언하고 나서 나중에 초기화 할때는 answer = {-1}; 이렇게 불가!
		}
		Arrays.sort(answer);
		return answer;
	}
}