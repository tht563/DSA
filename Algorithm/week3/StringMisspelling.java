package week3;

public class StringMisspelling {
	public static String solution(String S, String T) {
		//NOTHING
		if (S.equals(T)) {
			return "NOTHING";
		}
		//IMPOSSIBLE
		if (Math.abs(S.length()-T.length()) >=2) {
			return "IMPOSSIBLE";
		}
		//SWAP
		if (S.length()==T.length()) {
			boolean isFound = false;
			int holdIndex = -1;
			String result = "";
			
			for (int i=0; i<S.length(); i++) {
				if (S.charAt(i) != (T.charAt(i))) {
					if (isFound == false) {
						isFound = true;
						holdIndex = i;
					}else {
						if ((S.charAt(i) == T.charAt(holdIndex))&&(T.charAt(i) == S.charAt(holdIndex))){
							result = "SWAP "+String.valueOf(S.charAt(holdIndex))+" "+String.valueOf(S.charAt(i));
						}else {
							return "IMPOSSIBLE";
						}
					}
				}
			}
			return result;
		}
		//INSERT or DELETE
		int i = 0;
		int j = 0;
		boolean isFound = false;
		String result = "";
		char holdChar = 0;
		while ((i<S.length())&&(j<T.length())) {
			if (S.charAt(i) != T.charAt(j)) {
				if (isFound==false) {
					isFound = true;
					if ((S.length()<T.length())&&(S.charAt(i)==T.charAt(j+1))) {
						holdChar = T.charAt(j);
						j++;
					}
					if ((S.length()>T.length())&&(T.charAt(j)==S.charAt(i+1))) {
						holdChar = S.charAt(i);
						i++;
					}
				}else {
					return "IMPOSSIBLE";
				}
			}else {
				i++;
				j++;
			}
		}
		if (S.length()>T.length()) {
			result = "DELETE "+String.valueOf(holdChar);
		}else {
			result = "INSERT "+String.valueOf(holdChar);
		}
		return result;
	}
}
