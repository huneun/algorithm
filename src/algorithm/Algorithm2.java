package algorithm;
import java.util.*;

public class Algorithm2 {

	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			//if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			//else answer += Character.toLowerCase(x);
			if(x>=97 && x<=122) answer +=(char)(x-32);
			else answer +=(char)(x+32);
			
		}
		return answer;
	}
	
	public static void main(String[] arg) {
		Algorithm2 T = new Algorithm2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
	
}
