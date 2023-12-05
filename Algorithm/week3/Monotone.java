package week3;

public class Monotone {

	public static int solution(int[] A) {
		int count = 1;
		int maxLength = Integer.MIN_VALUE;
		int result = A.length-1;
		for (int i=A.length-1;i>0;i++) {
			if (A[i]<A[i-1]) {
				count++;
			}else {
				if (maxLength<count) {
					maxLength = count;
					result = i+count;
				}
			}
			
		}
		return result;

	}

}
