package 문자열;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		String answer = "";
		String my_string = "hello";
		int n = 3;
		char[] c = my_string.toCharArray();
		// String[] s = my_string.split("");
		for (char x : c) {
			System.out.println(x);
			for (int i = 0; i < n; i++) {
				answer += x;
			} // hhheee
			System.out.println("여기까지 " + answer);
		}

	}

}
