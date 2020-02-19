package leetCodeEasy;

public class LastWordLength {

	
	public static void main(String args[]) {
		String word = " ";
		
		
		String[] wordArray = word.split(" ");
		if(wordArray.length ==1)
			System.out.println("0");
		else
			System.out.println(wordArray[wordArray.length-1].length());
		
	}
}
