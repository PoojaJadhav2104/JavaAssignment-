package squareofnum;

import java.util.Scanner;

public class numberSquareRoot {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");  
		Scanner sc = new Scanner(System.in);  
		float num = sc.nextFloat();  
	    float sqrt = num / 2;  
		float temp = 0;  
        while (sqrt != temp)  
		{  
		  temp = sqrt; 
		  sqrt = ( num / temp + temp) / 2;  
		} 
        System.out.print("Sqrt of no. is:" + sqrt);  
	}
}
