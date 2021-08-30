package algorithm3;

import java.util.*;

public class Main1 {
	private String solution(String str) {
		/*String answer = "YES";
		
		 * str=str.toUpperCase(); for(int i=0; i<str.length()/2; i++) { if(str.charAt(i)
		 * != str.charAt(str.length()-i-1)) return "NO"; }
		 */
		
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
	
		return answer;
	}

	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));

	}

}
