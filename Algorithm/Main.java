import week3.*;

public class Main {

	public static void main(String[] args) {
		//Monotone
		int[] A = {10,20,30,25};
		System.out.println( Monotone.solution(A));
		
		//StrinMisspelling
		String S = "nice";
		String T = "niece";
		System.out.println(StringMisspelling.solution(S,T));
		
		//PublicTransportTickets
		int[] a = {1,4,6,7,8,20};
		System.out.println(PublicTransportTickets.solution(a));
	}

}
