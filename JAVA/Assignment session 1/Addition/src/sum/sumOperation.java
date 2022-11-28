package sum;

import java.util.Scanner; 

class sumOperation {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner sumOperation = new Scanner(System.in); 
    System.out.println("Enter a num 1:");
    x = sumOperation.nextInt(); 

    System.out.println("Enter a num 2:");
    y = sumOperation.nextInt(); 

    sum = x + y;  
    System.out.println("Sum is: " + sum); 
  }
} 