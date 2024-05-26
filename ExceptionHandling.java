package programs;

public class ExceptionHandling {

	public static void main(String[] args) {
 try {
		            // Code that may throw an exception
  int[] numbers = {1, 2, 3};
 System.out.println("Accessing the fourth element: " + numbers[3]);
	 } catch (ArrayIndexOutOfBoundsException e) {
		    // Handling the exception
System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
		System.out.println("Message: " + e.getMessage());
		    } finally {
 // Code that will always execute, regardless of whether an exception was thrown
System.out.println("This is the finally block. It always executes.");
		        }

		     try {
		            // Another example with arithmetic exception
		            int a = 10;
		            int b = 0;
		            int result = a / b;
		            System.out.println("Result: " + result);
		        } catch (ArithmeticException e) {
		            // Handling the exception
		            System.out.println("Exception caught: ArithmeticException");
		            System.out.println("Message: " + e.getMessage());
		        } finally {
		            // Code that will always execute, regardless of whether an exception was thrown
  System.out.println("This is the finally block for the arithmetic exception. It always executes.");
		        }

		        System.out.println("Program continues after exception handling.");
		    }
		


	}


