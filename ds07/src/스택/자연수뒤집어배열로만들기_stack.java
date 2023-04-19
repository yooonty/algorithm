package 스택;

import java.util.Stack;

public class 자연수뒤집어배열로만들기_stack {

	public static void main(String[] args) {
		long n = 12345;

		// 하나씩 분리시키고,
		String[] s = String.valueOf(n).split("");
		// stack에 순서대로 넣고
		Stack<String> stack = new Stack<>();
		for (String x : s) {
			stack.push(x);
		}
		System.out.println(stack);
		System.out.println(stack.peek());

		// int[]에 옮기기
		int[] result = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			result[i] = Integer.parseInt(stack.pop());
		}

	}

}
