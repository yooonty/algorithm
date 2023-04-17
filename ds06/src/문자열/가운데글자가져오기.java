package 문자열;

public class 가운데글자가져오기 {

	public static void main(String[] args) {
		String answer = "";
		String s = "abcde";
		if(s.length() % 2 != 0){
            answer = s.substring(s.length()/2, s.length()/2 + 1);
        } else {
            answer = s.substring(s.length()/2 -1, s.length()/2 + 1);
        }
		System.out.println(answer);
	}

}
