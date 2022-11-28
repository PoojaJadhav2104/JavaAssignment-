package sortingArray;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int nums[]=new int[10];
        int orderedNums[]=new int[10];
        int greater;
        String choice;
        System.out.println("Enter 10 integers : ");
        for (int i=0;i<nums.length;i++)
        {
            System.out.print(i+1+" -> ");
            nums[i] = sc.nextInt();
        }
        System.out.println();
        for(int inL=0;inL<nums.length;inL++)
        {
            greater=0;
            for(int inR=0;inR<nums.length;inR++)
            {
                if(nums[inL]>nums[inR])
                {
                    greater++;
                }
            }
            orderedNums[greater]=nums[inL];
        }
       System.out.print("Display order :\nA - Ascending\nD - Descending\nEnter your choice : ");
        choice = sc.next();
        if(choice.equalsIgnoreCase("a"))
        {
            for(greater=0;greater<orderedNums.length;greater++)
            {
                System.out.print(orderedNums[greater]+" ");
            }
        }
        else if(choice.equalsIgnoreCase("d"))
        {
            for(greater=9;greater>-1;greater--)
            {
                System.out.print(orderedNums[greater]+" ");
            }
        }

	}

}
