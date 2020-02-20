package leetCodeEasy;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = new int[6];
		int[] nums2= new int[] {4,5,6};
	
		
		int m=3;
		int n =3;
		
		nums1[0] = 1;
		nums1[1] = 2;
		nums1[2] = 3;
		
		int len = nums2.length;
		
		for(int i=3;i<nums1.length;i++) {
			
			nums1[i] =nums2[len-1];
			len--;
			
		}
		Arrays.sort(nums1);
		
		for(int i=0;i<nums1.length;i++) {
			System.out.println(nums1[i]);
		}
		
	}
	
}
