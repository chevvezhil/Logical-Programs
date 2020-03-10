package com.leetcode.medium;

public class AngleBetweenHourAndMin {

	public static void main(String[] args) {
		
		int hour = 12;
		int min = 30;
		
		
		int h = (hour%12*30) +(min*6/12);
		
		int result = Math.abs(h-min*6);
		int anotherAngle = 360-result;
	
		if(result > anotherAngle)
			System.out.println(anotherAngle);
		else
			System.out.println(result);
		
		Double.valueOf(result);
		
	}
	
	
}
