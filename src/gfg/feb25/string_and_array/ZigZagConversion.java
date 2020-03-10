package gfg.feb25.string_and_array;

public class ZigZagConversion {

	public static void main(String args[]) {
		
		int[] array = new int[] {4, 3, 7, 8, 6, 2, 1};
		sortArray(array);
		
		for(int i=1;i<array.length;i=i+2) {
			
			int temp = array[i];
			array[i] = array[i+1];
			array[i+1] = temp;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}
	
	
	public static void sortArray(int[] arrayTobeSorted) {
		
		for(int i=0;i<arrayTobeSorted.length;i++) {
			for(int j=0;j<arrayTobeSorted.length-i-1;j++) {
				
				if(arrayTobeSorted[j] > arrayTobeSorted[j+1]) {
					int temp =arrayTobeSorted[j];
					arrayTobeSorted[j] =arrayTobeSorted[j+1];
					arrayTobeSorted[j+1] = temp;
				}
			}
		}
		
		
	}
}
