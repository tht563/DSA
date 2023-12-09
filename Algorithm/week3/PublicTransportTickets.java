package week3;

import java.util.HashSet;

public class PublicTransportTickets {
	static public int solution (int[] A) {
		int[] prices = new int [31];
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i=0; i<A.length; i++) {
			set.add(A[i]);
		}
		for (int i=1; i<31; i++) {
			if (set.contains(i)) {
				int buy1 = prices[i-1]+2;
				int buy7 = Integer.MAX_VALUE;
				int buy30 = Integer.MAX_VALUE;
				if (i-7>=0) {
					buy7 = prices[i-7] +7;
				}
				if (i-30>=0) {
					buy30 = prices[i-30] +25;
				}
				prices[i] = Math.min(buy1, Math.min(buy7, buy30));
			}else {
				prices[i] = prices[i-1];
			}
		}
		return prices[30];
	}
}
