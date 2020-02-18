package leetCodeEasy;

public class RuntimeTest {
	public static void main(String[] args) 
    { 
        try
        { 
            // create a process and execute google-chrome 
            Process process = Runtime.getRuntime().exec("google-chrome"); 
            System.out.println("Google Chrome successfully started"); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
    } 
}
