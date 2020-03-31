package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstruction {
	
	public static void main(String[] args) {
	
	int[][] people = new int[][] {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
	
		int[][] result  = new int[people.length][];
		
		Arrays.sort(people, new Comparator<int[]>() {
			public int compare(int[] a1, int []a2) {
				if(a1[0] != a2[0])
					return a2[0]-a1[0]; //Descending order
				else 
					return a1[0]-a2[0];
			}
		});
		
		
		ArrayList<int[]> list = new ArrayList<>();
		
		for(int i=0; i<people.length; i++){
	        int[] arr = people[i];
	        list.add(arr[1],arr);
	    }
	
		for(int i=0;i<people.length;i++) {
			result[i] = list.get(i);
		}
		
		
	}
}
