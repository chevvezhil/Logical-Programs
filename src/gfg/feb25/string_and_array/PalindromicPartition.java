package gfg.feb25.string_and_array;

import java.util.ArrayList; 
import java.util.Deque; 
import java.util.LinkedList;
import java.util.List; 
  
public class PalindromicPartition 
{ 
    // Driver program 
    public static void main(String[] args)  
    { 
        String input = "nitin"; 
  
        System.out.println("All possible palindrome" +  
                            "partions for " + input  
                            + " are :"); 
  
        allPalPartitions(input); 
    } 
  
    
    private static void allPalPartitions(String input)  
    { 
        int n = input.length(); 
  
        List<List<String>> allPart = new ArrayList<>(); 
  
        Deque<String> currPart = new LinkedList<String>(); 
  
        allPalPartitonsUtil(allPart, currPart, 0, n, input); 
  
        for (int i = 0; i < allPart.size(); i++)  
        { 
            for (int j = 0; j < allPart.get(i).size(); j++) 
            { 
                System.out.print(allPart.get(i).get(j) + " "); 
            } 
            System.out.println(); 
        } 
  
    } 
  
   
    private static void allPalPartitonsUtil(List<List<String>> allPart,  
            Deque<String> currPart, int start, int n, String input) 
    { 
        if (start >= n)  
        { 
            allPart.add(new ArrayList<>(currPart)); 
            return; 
        } 
  
        for (int i = start; i < n; i++)  
        { 
              
            if (isPalindrome(input, start, i)) 
            { 
                  
                currPart.addLast(input.substring(start, i + 1)); 
                allPalPartitonsUtil(allPart, currPart, i + 1, n, input); 
                currPart.removeLast(); 
            } 
        } 
    } 
  
  
    private static boolean isPalindrome(String input,  
                                    int start, int i) 
    { 
        while (start < i)  
        { 
            if (input.charAt(start++) != input.charAt(i--)) 
                return false; 
        } 
        return true; 
    } 
} 