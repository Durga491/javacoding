package loops;
import java.util.Scanner;
public class ForloopDemo {

	public static void main(String[] args) {
		int num, i, factorial=1;
		System.out.println("Enter a number");
		
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		//4!=4*3*2*1
		for(i=1;i<=num;i++) {
			
			factorial=factorial*i;
			
		}
		System.out.println("Factorial of "+num+" = 5"+factorial);
	}

}
