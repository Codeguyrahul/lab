//write a program to find the average of input value.
package OBJECT;
import java.util.Scanner;

public class Average {//class
public static void main(String[] args) {
	int First_number=0, Second_number=0, Third_number=0, Fourth_number=0,Fifth_number=0; // define variable
	int Avg=0;
	Scanner sc = new Scanner(System.in);// take input from user
	System.out.println("enter the first number:");
		First_number=sc.nextInt();
		System.out.println("enter the second number:");
		Second_number=sc.nextInt();
		System.out.println("enter the thrid number:");
		Third_number=sc.nextInt();
		System.out.println("enter the fourth number:");
		 Fourth_number=sc.nextInt();
		 System.out.println("enter the fifth number:");
		 Fifth_number=sc.nextInt();
		 
	
	Avg=(First_number+ Second_number+Third_number+ Fourth_number+Fifth_number)/5;//total average of values
	 System.out.println("Total number Average is :"+ Avg);// print the average
}
}
