package com.leetcode.medium;

import java.util.Arrays;

public class ZigZagConversion {

	public static void main(String[] args) {
		
		String string = "PAYPALISHIRING";
		int rows = 3;
		
		boolean down = true;
		
		int row =0;
		
		String[] array = new String[rows];
		
		char[] charArray = string.toCharArray();
		
		Arrays.fill(array, " ");
		
		//PAHNAPLSIIGYIR
		for(int i=0;i<string.length();++i) {
			
			array[row] += (charArray[i]);
			
			if(row == rows-1) {
				down = false; 
			}else if(row ==0) {
				down = true;
			}
			
			if(down)
				row++;
			else 
				row--;
			
		}
		
		String result = "";
        
        for(int i=0;i<array.length;i++){
            result +=array[i].trim();
        }
        
		System.out.println(result.trim());
	}
	
}
