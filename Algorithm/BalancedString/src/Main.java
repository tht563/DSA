import java.util.*;
public class Main {
	static public void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		String str = scan.nextLine();
		System.out.println(Solution.solution(str));
	}
	
	class Solution{
		static public int solution(String S) {
			int[] upper = new int[26];
			int[] lower = new int[26];
			
			int count = 0;
			int result = Integer.MAX_VALUE;		
			
			for (int i=0; i<S.length(); i++) {
				if ((int)S.charAt(i)<91) {
					upper[(int)S.charAt(i)-65] = 1;
				}else {
					lower[(int)S.charAt(i)-97] = 1;
				}
			}
			
			Set <Character> appear = new HashSet<>();
			Set <Character> waiting = new HashSet<>();
			
			for (int i=0; i<S.length();i++) {
				if ((((int)S.charAt(i)<90)&&(lower[(int)S.charAt(i)-65]==0))||(((int)S.charAt(i)>90)&&(upper[(int)S.charAt(i)-97]==0))) {
					if ((waiting.size()==0)&&(count<result)&&(count!=0)) {
						result = count;
					}
					count = 0;
					appear.clear();
					waiting.clear();
					continue;
				}
				
				if (!appear.contains(S.charAt(i))) {
					appear.add(S.charAt(i));
				}
				if (waiting.contains(S.charAt(i))) {
					waiting.remove(S.charAt(i));
				}
				if (((int)S.charAt(i)>91)&&(!appear.contains(Character.toUpperCase(S.charAt(i))))) {
					waiting.add(Character.toUpperCase(S.charAt(i)));
				}
				if (((int)S.charAt(i)<91)&&(!appear.contains(Character.toLowerCase(S.charAt(i))))) {
					waiting.add(Character.toLowerCase(S.charAt(i)));
				}
				count++;
				
				if (i==S.length()-1) {
					if ((waiting.size()==0)&&(count<result)&&(count!=0)) {
						result = count;
					}
				}
				
			}
			if (result == Integer.MAX_VALUE) {
				return -1;
			}else {
				return result;
			}
		}
	}
}
