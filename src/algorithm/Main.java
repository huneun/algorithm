package algorithm;
import java.util.*;
public class Main {
	public String solution(String str) {
		String answer ="";
		
		String[] strArray=str.split(" ");
		int max =0;
		for(int i =0; i<strArray.length; i++) {
			if(max < strArray[i].length()) {
				max = strArray[i].length();
				answer=strArray[i];
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

}
