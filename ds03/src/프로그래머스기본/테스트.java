package 프로그래머스기본;

import java.util.ArrayList;
import java.util.Arrays;

public class 테스트 {

	public static void main(String[] args) {
		int angle = 100;
		Solution100 sol = new Solution100();
		int answer = sol.solution(angle);
		System.out.println(answer);
	}
}

class Solution100 {
	public int solution(int angle) {
		String str = "abC";
		String a = "";
		String b = a;
		System.out.println(a==b);
		
		return 0;
	}
}