package 배열;

import java.util.Arrays;
import java.util.Random;

public class 배열최댓값구하기3 {

	public static void main(String[] args) {
		Random r = new Random(100);
		int[] s = new int[10];
		int[] s2 = new int[10];

		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000);
			s2[i] = r.nextInt(1000);
		}
		// 오름차순으로 정렬한 다음 맨앞(최소값), 맨끝(최대값)
		Arrays.sort(s); // 원본을 바꿔버림(파괴형 함수)
		System.out.println("최소값: " + s[0]);
		System.out.println("최대값: " + s[s.length - 1]);

		System.out.println("두 배열이 같은가요?: " + Arrays.equals(s, s2));
		String result = Arrays.toString(s);
		System.out.println(result);
		System.out.println("스트링의 글자수: " + result.length());
		System.out.println("배열의 개수: " + s.length);

		String ss1 = "나는 프로그래머프야";
		String ss2 = "진짜!!";
		System.out.println(ss1 + ss2); // 스트링 결합
		System.out.println(ss1.concat(ss2)); // 스트링 결합
		System.out.println(ss1.charAt(0)); // 문자 1글자 추출
		System.out.println(ss1.endsWith("야")); // 특정한 문자로 끝나는 지 확인
		System.out.println(ss1.substring(3)); // 인덱스 3이후 글자들 모두 추출
		System.out.println(ss1.substring(3, 8)); // 인덱스 3~7까지 추출
		System.out.println(ss1.contains(ss2)); // ss1에 ss2가 포함되어 있는지 확인
		System.out.println(ss1.lastIndexOf("프")); // ss1 중 특정글자 위치 추출
		System.out.println(ss1.toUpperCase()); // 대문자로
		System.out.println(ss1.toLowerCase()); // 소문자로
		System.out.println(ss1.length()); // 글자수
		System.out.println(ss1.replace("프", "스"));
	}

}
