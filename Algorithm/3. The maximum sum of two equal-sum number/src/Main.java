import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] array = s.split(" ");
		int[] nums = new int[array.length];
		for (int i=0; i<array.length;i++) {
			nums[i] = Integer.valueOf(array[i]);
		}
		
		System.out.println(Solution.maximumSum(nums));
		
	}
	
	class Solution{
		static public int maximumSum(int[] nums) {
			int[] array = new int [82];
			int max = -1;
			for (int i:nums) {
				int number = i;
				int sumOfDigit = 0;
				
				while (number != 0) {
					sumOfDigit +=number%10;
					number = number/10;
				}
				if ((array[sumOfDigit]!=0) && (max<array[sumOfDigit]+i)){
					max = array[sumOfDigit]+i;
				}
				if (array[sumOfDigit]<i) {
					array[sumOfDigit] = i;
				}
			}
			return max;
		}
	}

}
