package algorithm4;

import java.util.Scanner;

public class Main1 {

	private int solution(String s) {
		String answer = "";
		// ����0~9�� �ƽ�Ű�ڵ�� 48~57 ���̿� �ִ�.
		for(char x : s.toCharArray()) {
			//if(x >= 48 && x<=57) answer = answer*10+(x-48); // �ƽ�Ű�ڵ带 �ڸ��� �� 10������ ��Ÿ���� ���
		  if(Character.isDigit(x)) answer+=x; // ���ڰ� ������ ���� �����ִ� isDigit
		}
		
		return Integer.parseInt(answer); // �տ� ������ 0 ���� �ڵ����������.
	}
	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(T.solution(s));

	}

}
