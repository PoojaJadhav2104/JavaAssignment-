package tothepower;

import java.util.Scanner;

public class MathPow {

	public static void main(String[] args) {
		 int base = 2, expo = 3;
		 Scanner sc = new Scanner(System.in);
		 System. out. println("Enter base number:");
		 base=sc.nextInt();
		 System. out. println("Enter exponential number:");
		 expo=sc.nextInt();
		 double pow = Math.pow(base, expo);

		  System.out.println("Result: " + pow);
	}

}
