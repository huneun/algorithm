package algorithm4;

import java.util.Scanner;

public class Main2 {

	private int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		int p = 1000;
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i)==t) {
				p=0;
				answer[i]=p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		p=1000;
		for(int i=s.length(); i>=0; i--) {
			if(s.charAt(i)==t) p=0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p); // 매개 값끼리 비교하여 작은값을 리턴
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		char t = kb.next().charAt(0);
		System.out.println(T.solution(s,t));
	}

}
