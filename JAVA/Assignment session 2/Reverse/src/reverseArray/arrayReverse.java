package reverseArray;

import java.util.Scanner;

public class arrayReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr = sc.next();
        reverse(arr, arr.length);
   }
	static int[] reverse(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) 
        {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
  
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (k = 0; k < n; k++) 
        {
            System.out.println(a[k]);
        }
		return a;
    }
}
