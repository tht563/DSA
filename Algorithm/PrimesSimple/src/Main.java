import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		System.out.println(Solution.solution(A,B));
	}
	
	class Solution{
		public static int solution(int A, int B) {
			int[] array = new int[500001];
			int count = 0;
			
			array[1]=0;
			
			for (int i=2; i<500001; i++) {
				int weight = 2;
				int number = i*2;
				
				if (array[i]==-1) {
					continue;
				}
				array[i]=1;
				
				while (number<50000) {
					
					array[number] = -1;
					weight++;
					number = i*weight; 
				}
			}
			
			for (int i=A;i <=B; i++) {
				if (array[i]==1) {
					count++;
				}
			};
			return count;
		}
	}

}
