//write the code to swap the two value.
package OBJECT;
import java.util.Scanner;

public class Swapping {//class
public static void main(String[] args) {
	int first,second,third=0;//define variable
	Scanner sc=new Scanner(System.in);//take input from user
	System.out.println("enter the first value:");
	first=sc.nextInt();
	System.out.println("enter the second value:");
	second=sc.nextInt();
	// Swapping method
	third=first;
	first=second;
	second=third;
	// print the value first_value,second_value.
System.out.println("now first vaule is:"+ first);
System.out.println("now second vaule is:"+ second);	
	
}
}
