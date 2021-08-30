package algorithm3;

import java.util.Scanner;

import algorithm2_2.Main;

public class Main3 {

	private String solution(String s) {
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >= 48 && s.charAt(i)<=57) {
				if(answer == "" && s.charAt(i) == '0') {
					
				}else {
					answer +=s.charAt(i);
				}
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Main3 T = new Main3();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(T.solution(s));

	}

}
