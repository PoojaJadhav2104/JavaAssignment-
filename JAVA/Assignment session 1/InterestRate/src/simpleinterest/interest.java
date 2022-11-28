package simpleinterest;

import java.util.Scanner;

public class interest {
public static void main(String[] args) {
	double principle, rate, year, simpleint;
    Scanner sc=new Scanner (System. in);
    System.out.println("Enter the amount:");
    principle=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    year=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    rate=sc.nextDouble();
    simpleint=(principle * year * rate)/100;
    System.out.println("Simple Interest="+simpleint);
   
}
}
