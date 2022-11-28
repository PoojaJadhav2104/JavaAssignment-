package swap;

import java.util.Scanner;

public class swapNum {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		System.out.println("Before swapping :"+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping :"+a+" "+b);
	}

}
