//write the program to calculate the addition,subtract,multiply,division.
package OBJECT;
import java .util .Scanner;// import Scanner function to input.
public class Calculator{
	public static void main(String[] args) {
		//take input value  from user:-
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of num1:");
		num1=sc.nextInt();
		System.out.println("enter the value of num2S:");
		num2=sc.nextInt();
		// operations:-
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div =num1/num2;
		
		// outputs:-
		System.out.println("sum of two value:"+sum);
		System.out.println("sub of two value:"+sub);
		System.out.println("mul of two value:"+mul);
		System.out.println("div of two value:"+div);
	}
}