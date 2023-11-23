import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String[] arrayOfStr = str.split(" ");
		int[] prices = new int[arrayOfStr.length];
		
		for (int i=0; i<arrayOfStr.length; i++) {
			prices[i] = Integer.valueOf(arrayOfStr[i]);
		}
		System.out.println(Solution.maxProfit(prices));
		
	}
	static class Solution {
	    public static int maxProfit(int[] prices) {
	        int result = 0;

	        int buyPrice = prices[0];

	        int supBuyPrice = Integer.MAX_VALUE;
	        int supIndex = Integer.MAX_VALUE;

	        int sellPrice = 0;
	        int sellIndex = 0;

	        for (int i=1; i<prices.length; i++){
	            if ((buyPrice>prices[i])&&(sellPrice==0)){
	                buyPrice = prices[i];
	                continue;
	            }  
	            if ((prices[i]<supBuyPrice)&&(prices[i]<buyPrice)){
	                supBuyPrice = prices[i];
	                supIndex = i;
	                continue;
	            }
	            if (i>supIndex){
	                buyPrice = supBuyPrice;
	            }
	            if (result<prices[i]-buyPrice){
	                result = prices[i] - buyPrice;
	            }
	        }
	        return Math.max (0,result);
	    }
	}
}
