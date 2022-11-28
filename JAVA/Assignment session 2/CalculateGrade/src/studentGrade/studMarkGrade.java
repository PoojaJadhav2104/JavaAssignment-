package studentGrade;

import java.util.Scanner;

public class studMarkGrade {

	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		int num = 1;
		System.out.print("Enter number of subjects: \n");
        num = sc.nextInt();
		int marks[] = new int[num];
        int i;
        float total=0, avg;
        
        
        for(i=0; i<num; i++) 
        { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = sc.nextInt();
           total = total + marks[i];
        }
        sc.close();
        avg = total/num;
        System.out.print("The student average marks is: "+ avg);
        System.out.print("\nThe student Grade is: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=70 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<70)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
	}
}
