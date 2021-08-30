package algorithm2;

import java.util.*;

public class Main {
	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//		}
		/*내답
		 * char temp; for(String x : str) { char[] s = x.toCharArray(); for(int i =0;
		 * i<x.length()/2; i++) { if(x.length() %2 ==0) { temp=s[x.length()-1-i];
		 * s[x.length()-1-i] = s[i]; s[i] = temp; }else { if(i != x.length()/2 +1) {
		 * temp=s[x.length()-1-i]; s[x.length()-1-i] = s[i]; s[i] = temp; } } } String
		 * m= ""; for(int i= 0; i<s.length; i++) { m += s[i]; } answer.add(m); }
		 */
		
		//보다 간단한 로직
		for(String x : str) {
			char[] s=x.toCharArray();
			int lt = 0, rt = s.length-1;
			char tmp;
			while(lt<rt) {
				tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			answer.add(String.valueOf(s));
		}
		
		return answer; 
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] strs = new String[num];
		for(int i =0; i<num; i++) {
			strs[i]=sc.next();
		}
		for(String x : T.solution(num, strs)){
        	System.out.println(x);
        };

	}

}
