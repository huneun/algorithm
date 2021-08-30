package algorithm2_2;
import java.util.*;
import java.util.regex.Pattern;
public class Main {

	public String solution(String str){
		String answer = "";
		char[] ch = str.toCharArray();
		
		int lt =0, rt =ch.length-1;
		char tmp;
		String patten = "^[a-zA-Z]*$";
		
		while(lt<rt) {
			if(!Pattern.matches(patten, String.valueOf(ch[lt]))) {
				//!Character.isAlphabetic(ch[lt])µµ °¡´É
				lt++;	
			}else if(!Pattern.matches(patten, String.valueOf(ch[rt]))) {
				rt--;				
			}else {
				tmp=ch[lt];
				ch[lt]=ch[rt];
				ch[rt]=ch[lt];
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(ch);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));

	}

}
