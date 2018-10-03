import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello out there"); //Sends output to screen
		System.out.println("I will add two numbers for you");
		System.out.println("Enter two whole numbers on a line");
				
        int n1, n2; //Says that n1 and n2 are variables that hold integers(whole numbers)
        
        
        Scanner keyboard = new Scanner(System.in); // readies the program for a keyboard input
        n1 = keyboard.nextInt(); // reads one integer from the keyboard
        n2 = keyboard.nextInt();
        
        
        
        System.out.println("The sum of those two numbers is");
        System.out.println(n1 + n2);
	}

}
