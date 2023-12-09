package week3;

public class Monotone {

	public static int solution(int[] A) {
		int count = 1;
		int maxLength = Integer.MIN_VALUE;
		int result = 0;
		for (int i=1;i<A.length;i++) {
			if (A[i]>A[i-1]) {
				count++;
			}else {
				if (maxLength<count) {
					maxLength = count;
					result = i-count;
					count = 1;
				}
			}
			
		}
		return result;

	}

}
