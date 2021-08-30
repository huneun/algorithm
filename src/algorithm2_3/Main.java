package algorithm2_3;
import java.util.*;

public class Main {

	public String solution(String str) {
		String answer = "";
	
		/*
		 * ArrayList<Character> arr = new ArrayList<>(); char[] ch = str.toCharArray();
		 * for(char x : ch) { if(arr.indexOf(x) == -1) { arr.add(x); answer += x; } }
		 */
		 
		
		for(int i =0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));

	}

}
