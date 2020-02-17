package runtime;

import java.util.ArrayList;

public class LongStringPalindrome {

	public static void main(String args[]){
		
		
		String test = "a";
		
		if(test.length() <=1)
			System.out.println(test);
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<test.length()-1;i++){
			
			String iVal = String.valueOf(test.charAt(i));
		
			for(int j=i+1;j<test.length();j++){
				String jVal = String.valueOf(test.charAt(j));
				iVal = iVal.concat(jVal);
					if(isPalindrome(iVal)){
						System.out.println("yes palindrom");
						list.add(iVal);
					
				}
				
			}
			
		}
		
		if(list.size() ==1)
			System.out.println(list.get(0));
		
		for(int i=0;i<list.size();i++){
			for(int j=i+1; j<list.size();j++){
				if(list.get(i).length() > list.get(j).length()){
					System.out.println(list.get(i));
				}else if (list.get(i).length() < list.get(j).length()){
					System.out.println(list.get(j));
				}else {
					System.out.println(list.get(i));
				}
			}
			
		}
		
		
		
	}
	
	
	public static boolean isPalindrome(String string){
		
		System.out.println("is " + string);
		String reverse = "";
		
		for(int i=string.length()-1;i>=0;i--){
			reverse = reverse + string.charAt(i);
		}
		
		if(string.equals(reverse))
			return true;
	
		return false;
	}
}
