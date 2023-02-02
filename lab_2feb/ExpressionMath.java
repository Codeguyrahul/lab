//write a program to solve specified expression.
package OBJECT;
import java.util.Scanner;//import SCanner function to user  input

public class ExpressionMath {//class
	public static void main(String[] args) {
		float a,b,c,d; //define variable
		float total=0;
		Scanner sc=new  Scanner(System.in);//take input from user
		System.out.println("enter the value of a:");
		a=sc.nextFloat();
		System.out.println("enter the value of b:");
		b=sc.nextFloat();
		System.out.println("enter the value of c:");
		c=sc.nextFloat();
		System.out.println("enter the value of d:");
		d=sc.nextFloat();
		total = (a*b-b*b)/(c-d);// mathematical expression
		System.out.println("Expression output is:"+ total);//print expression output
		
	}

}
