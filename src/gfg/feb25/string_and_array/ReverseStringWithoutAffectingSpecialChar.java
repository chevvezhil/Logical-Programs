package gfg.feb25.string_and_array;

public class ReverseStringWithoutAffectingSpecialChar {

	public static void main(String[] args) {
	
	String s = "h,ui!r";
	
	char[] charArray = s.toCharArray();
	
	int l =0, r = s.length()-1;
	
	while(l<r) {
		
		if(!Character.isAlphabetic(charArray[l]))
			l++;
		else if(!Character.isAlphabetic(charArray[r]))
			r--;
		
		else {
			char temp = charArray[l];
			charArray[l] = charArray[r];
			charArray[r] = temp;
			l++;
			r--;
		}
		
	}
	String revStr = new String(charArray); 
	System.out.println(revStr);
		
		
	}
	
}
