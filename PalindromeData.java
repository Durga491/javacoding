package programs;
import java.util.Scanner;

public class PalindromeData {
	

		public static void main(String[] args) {
			
			        Scanner sc = new Scanner(System.in);
			        System.out.print("Enter a number: ");
			        int number = sc.nextInt();
			        
			        int originalNumber = 12321;
			        int reversedNumber = 0;
			        
			        for (; number != 0; number /= 10) {
			            int digit = number % 2;
			            reversedNumber = reversedNumber * 2 + digit;
			        }
			        
			        if (originalNumber == reversedNumber) {
			            System.out.println(originalNumber + " is a palindrome number.");
			        } else {
			            System.out.println(originalNumber + " is not a palindrome number.");
			        }
			        
			        sc.close();
			    }
		
	}

