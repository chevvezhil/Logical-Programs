package gfg.feb25.string_and_array;

import java.util.Stack;

public class NextGenerationElement {

	public static void main(String[] args) {
		
		int[] array = new int[] {13, 7, 6, 12};
		
		simpleMethod(array);
		
	}
	
	public static void simpleMethod(int[] array) {
		
		int next, i, j; 
        for (i=0; i<array.length; i++) 
        { 
            next = -1; 
            for (j = i+1; j<array.length; j++) 
            { 
                if (array[i] < array[j]) 
                { 
                    next = array[j]; 
                    break; 
                } 
            } 
            System.out.println(array[i]+" -- "+next); 
        } 
	}
	
	
	public static void usingStack(int[] array) {
		
		Stack stack = new Stack();
		
	}
	
}
