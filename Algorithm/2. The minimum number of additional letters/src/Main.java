import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String S = scan.next();
		System.out.println( Solution.solution(S));
	}
	class Solution{
		static public int solution(String S) {
			int countBlock = 1, max = Integer.MIN_VALUE;
			int countChar = 1;
			for (int i=1; i<S.length(); i++) {
				if (S.charAt(i)==S.charAt(i-1)) {
					countChar++;
				}
				if (S.charAt(i)!=S.charAt(i-1)) {
					countBlock++;
					countChar= 1;
				}
				if (max<countChar) {
					max = countChar;
				}
			}
			return max*countBlock-S.length();
		}
	}

}
