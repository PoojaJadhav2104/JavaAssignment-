package amstrgnum;

import java.util.Scanner;

public class NumberAmstrong {

	public static void main(String[] args) 
	{
		 System.out.print("Enter a number: ");
         Scanner sc=new Scanner(System.in);
         float num = sc.nextFloat();
         float temp = num; 
         float r=0;
          
         while (num >  0)
         {	 
           float rem = num % 10;
           r = (r) + (rem * rem * rem);
           num = num/10;
         }		 
         if (num == r) 
         {
	            System.out.println(temp + " is an Armstrong number.");
         }
	     else
	     {
	            System.out.println(temp + " is not an Armstrong number.");
	     }
     }
}