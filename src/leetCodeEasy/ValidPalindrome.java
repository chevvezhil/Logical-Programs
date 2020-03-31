package leetCodeEasy;

public class ValidPalindrome {
	
	
	boolean isPalindrome(String s) {
		
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1))
				return false;
		}
		return true;
	}

	
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: ```Panama";
		System.out.println(s);
		
		s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
	//	s= s.replaceAll("(\\W)","");
		
		System.out.println("string " + s);
		
		ValidPalindrome vp = new ValidPalindrome();
		boolean isPalindrome = vp.isPalindrome(s);
		
		if(isPalindrome)
			System.out.println("YEs");
		else
			System.out.println("no");
	}
	
}
