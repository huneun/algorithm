package algorithm3;
import java.util.*;

import algorithm2_2.Main;

public class Main2 {
	private String solution(String s) {
		String answer = "No";
		s=s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) {
			return "YES";
		}
		return answer;
	}
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(T.solution(s));

	}

}
