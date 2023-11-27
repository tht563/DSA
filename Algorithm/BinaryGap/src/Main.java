import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(Solution.solution(N));
	}
	
	class Solution{
		static public int solution(int N) {
			boolean isStart = false;
			int count = 0;
			int result = Integer.MIN_VALUE;
			for (int i=31; i>=0; i--) {
				if ((N<Math.pow(2, i))&&(isStart==true)) {
					count++;
				}
				if(N>=Math.pow(2, i)) {
					isStart = true;
					result = Math.max(result, count);
					count = 0;
					N -= Math.pow(2, i);
				}
				
			}
			
			return(result);
		}
	}
}
