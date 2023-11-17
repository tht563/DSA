import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] nums = new int[n];
		for (int i=0; i<n; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println( Solution.maxAlternatingSum(nums));
		
	}
	
	class Solution {
		public static long maxAlternatingSum(int[] nums) {
		
			long evenSum = nums[0];
			long oddSum = 0;
			
			long evenSize = 1;
			long oddSize = 0;
			
			long prevEven = nums[0];
			long prevOdd = -1;
			
			for (int i=1; i< nums.length;i++) {
				if ((nums[i]>prevEven)&&(evenSize>oddSize)) {
					evenSum = evenSum - prevEven + nums[i];
					prevEven = nums[i];
					continue;
				}
				if (evenSize >oddSize) {
					oddSum += nums[i]; 
					oddSize++;
					prevOdd = nums[i];
					continue;
				}
				if (prevOdd>nums[i]) {
					oddSum = oddSum-prevOdd+nums[i];
					prevOdd = nums[i];
					continue;
				}
				
				evenSum += nums[i];
				prevEven = nums[i];
				evenSize++;
				
				
				
			}
            if (evenSize>oddSize){
                return ((evenSum-oddSum)%1000000000);
            }else{
                return ((evenSum-oddSum+prevOdd)%1000000000);
            }
		}
	}

}
