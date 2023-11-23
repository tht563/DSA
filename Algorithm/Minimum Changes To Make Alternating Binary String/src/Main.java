import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arrayOfStr = str.split(" ");
		int[] A = new int[arrayOfStr.length];
		for (int i=0; i<arrayOfStr.length; i++) {
			A[i] = Integer.valueOf(arrayOfStr[i]);
		}
		System.out.println(Solution.solution(A));
		
	}
	
	class Solution {
		static public int solution (int[] A) {
			int headStart = 0;
			int tailStart = 0;
			for (int i=0; i<A.length; i++) {
				if (i%2==0) {
					if (A[i]==1) {
						tailStart++;
					}else {
						headStart++;
					}
				}else {
					if (A[i]==0) {
						tailStart++;
					}else {
						headStart++;
					}
				}
			}
			return Math.min(headStart, tailStart);
		}
	}

}
