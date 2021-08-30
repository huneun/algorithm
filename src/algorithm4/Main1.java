package algorithm4;

import java.util.Scanner;

public class Main1 {

	private int solution(String s) {
		String answer = "";
		// 숫자0~9는 아스키코드로 48~57 사이에 있다.
		for(char x : s.toCharArray()) {
			//if(x >= 48 && x<=57) answer = answer*10+(x-48); // 아스키코드를 자리수 별 10진수로 나타내는 방법
		  if(Character.isDigit(x)) answer+=x; // 숫자가 맞으면 참을 돌려주는 isDigit
		}
		
		return Integer.parseInt(answer); // 앞에 나오는 0 값을 자동으로지운다.
	}
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(T.solution(s));

	}

}
