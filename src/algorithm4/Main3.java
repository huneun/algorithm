package algorithm4;

import java.util.*;

public class Main3 {

	//문자열 압축
	public String solution(String str) {
		String answer ="";
		str+=" ";
		int count = 1;
		for(int i =0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				answer += str.charAt(i);
				if(count>1) answer += String.valueOf(count);
				count =1;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Main3 T = new Main3();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

}
