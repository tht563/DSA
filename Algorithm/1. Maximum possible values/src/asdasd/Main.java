package asdasd;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arrayOfStr = str.split(" ");
		System.out.println(arrayOfStr);
	}
	
	static class Solution {
	    public int maxProfit(int[] prices) {
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
