package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 문자열내림차순배치 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";

		// 방법1. Arrays.sort, StringBuilder 이용!
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String s2 = new String(c);
		StringBuilder sb = new StringBuilder(s2); //char[]배열을 이용해서 String으로 바로 만들 수 있음.
		sb.reverse();
		answer = sb.toString();
		System.out.println(answer);
		
		// 방법2. Collections 이용!1
		String[] s3 = s.split("");
		List<String> list = Arrays.asList(s3);
		Collections.sort(list);
		Collections.reverse(list);
		String result = list.stream().collect(Collectors.joining());
		System.out.println(result);
		
		
	}

}
