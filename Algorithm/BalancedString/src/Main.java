import java.util.*;
public class Main {
	static public void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		String str = scan.nextLine();
		System.out.println(Solution.solution(str));
	}
	
	class Solution{
		static public int solution(String S) {
			int[] upper = new int[26];
			int[] lower = new int[26];
			
			int count = 0;
			int result = Integer.MAX_VALUE;		
			
			for (int i=0; i<S.length(); i++) {
				if ((int)S.charAt(i)<91) {
					upper[(int)S.charAt(i)-65] = 1;
				}else {
					lower[(int)S.charAt(i)-97] = 1;
				}
			}
			
			Set <Character> appear = new HashSet<>();
			Set <Character> waiting = new HashSet<>();
			
			for (int i=0; i<S.length()-1;i++) {
				appear.clear();
				waiting.clear();
				count=0;
				for (int j=i;j<S.length();j++) {
					if (((((int)S.charAt(j)<91)&&(upper[(int)S.charAt(j)-65]==0))||(((int)S.charAt(j)>91)&&(lower[(int)S.charAt(j)-97]==0)))||((waiting.size()==0)&&(count>0))) {
						if ((waiting.size()==0)&&(count>0)&&(count<result)){
							result = count;
						}
						appear.clear();
						waiting.clear();
						count=0;
						break;
					}
					if (!appear.contains(S.charAt(j))) {
						appear.add(S.charAt(j));
					}
					if (waiting.contains(S.charAt(j))) {
						waiting.remove(S.charAt(j));
					}
					if (((int) S.charAt(j)>91)&&(!appear.contains(Character.toUpperCase(S.charAt(j))))) {
						waiting.add(Character.toUpperCase(S.charAt(j)));
					}
					if (((int) S.charAt(j)<91)&&(!appear.contains(Character.toLowerCase(S.charAt(j))))) {
						waiting.add(Character.toLowerCase(S.charAt(j)));
					}
					count++;	
					if (j==S.length()-1) {
						if ((waiting.size()==0)&&(count>0)&&(count<result)){
							result = count;
						}
					}
					if ((count>result)&&(result!=Integer.MAX_VALUE)) {
						break;
					}
				}
			}
			
			if (result == Integer.MAX_VALUE) {
				return -1;
			}else {
				return result;
			}
		}
	}
}
