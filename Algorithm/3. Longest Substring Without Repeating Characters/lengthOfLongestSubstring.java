import java.util.HashMap;
import java.util.Scanner;

public class lengthOfLongestSubstring {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(Solution.lengthOfLongestSubstring(s));
    }
    class Solution{
        public static int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0;
            int privot = 0;
            for (int i=0; i<s.length(); i++){
                if (map.containsKey(s.charAt(i))){
                    max = Math.max(max,i-privot);
                    privot = Math.max(privot, map.get(s.charAt(i))+1);
                }
                map.put(s.charAt(i),i);
                if (i==s.length()-1){
                    max = Math.max(max,i-privot+1);
                }
            }
            return max;
        }
    }
}
