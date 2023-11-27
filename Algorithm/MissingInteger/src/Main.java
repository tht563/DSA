import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		for (int i=0; i<N; i++) {
			A[i] = scan.nextInt();
		}
		System.out.println(Solution.solution(A));

	}
	class Solution{
		public static int solution(int[] A) {
			HashSet<Integer> set = new HashSet<>();
			for (int i:A) {
				set.add(i);
			}

			for (int i=1;i<=A.length+1;i++) {
				if (!set.contains(i)) {
					return i;
				}
			}
			return -1;
		}
	}

}
