package switchcasepat;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) 
	{
		int ch=0;
		System.out.println("1.Triangular pattern\n 2.Diamond pattern");
		System.out.println("Enter your choice: ");
		Scanner sc=new Scanner(System.in);
	    ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the number of rows: ");
			int rows = sc.nextInt();
			triangle(rows);
			
		case 2:
			System.out.println("Enter the number of rows: ");
			int row = sc.nextInt();
			diamond(row);
		}
		
	}
	

	public static void triangle(int r)
	{
	 System.out.println("Enter the number of rows to be printed");
      
        for (int i = 1; i <= r; i++) 
        {    
            for (int j = r; j >= i; j--) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();

         }
	}
	
	public static void diamond(int r)
	{   
		int i,j;
		int space = r - 1;
        for (j = 1; j <= r; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= r - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (r - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
     }
}
