package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("honghong");
		System.out.println(sb1);

		StringBuilder sb11 = new StringBuilder("honghong");
		System.out.println(sb11);

		StringBuilder sb2 = new StringBuilder("honghong");
		System.out.println(sb2);

		System.out.println(sb1 == sb2);
		sb1.append("hahaha123");
		System.out.println(sb1);
		sb1.replace(0, 8, "hohoho");
		System.out.println(sb1);
		sb1.delete(0, 8);
		System.out.println(sb1);
		sb1.deleteCharAt(0);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		String s = "honghong";
		String[] s4 = s.split("");
		List<String> list = Arrays.asList(s4);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
	}

}
