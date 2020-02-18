package leetCodeEasy;

import java.util.ArrayList;
import java.util.List;

public class CommonChar {

	
	public static void main(String args[]){
		String[] A = new String[]{"cool","bell"};

	    String firstString = A[0];
	    List<String> list = new ArrayList<String>();
	        
	        for(Character ch : firstString.toCharArray())
	        {
	            for(int i=1;i<A.length;i++){
	                for(Character c1 : A[i].toCharArray()){
	                    if(ch.equals(c1)){
	                    	for(int k=0;k<A[i].length();k++){
	                    		Character c2 = A[i].charAt(k);
	                    		if(ch.equals(c2)){
	                    			list.add(String.valueOf(ch));
	                    		}
	                    	}
	                    	
	                    }
	                }
	            }
	            
	            
	        }    
	}
	
}
