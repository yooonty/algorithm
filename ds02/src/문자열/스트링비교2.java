package 문자열;

import java.util.Arrays;
import java.util.List;

public class 스트링비교2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		String[] arr = all.split(",");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains(" ")) {
				arr[i] = arr[i].replace(" ", "");
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("과목 수:" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("컴퓨터")) {
				System.out.println("컴퓨터 위치:" + i);
				break;
			}
		}
		List<String> list = Arrays.asList(arr);
		System.out.println(list.indexOf("컴퓨터"));
		int count = 0;
		for (String s : arr) {
			if (s.length() < 3) {
				count++;
			}
		}
		System.out.println("3글자 미만인 과목수:" + count);
		
	}

}
