package method;
import java.util.Scanner;

public class SmallestValue {// main class
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);// scanner for input
		System.out.println("enter the first number:");
		int n1=sc.nextInt();
		System.out.println("enter the Second number:");
		int n2=sc.nextInt();
		System.out.println("enter the third number:");
		int n3=sc.nextInt();
		
		System.out.println(" the smallest value is:"+ smallestNum(n1, n2, n3));
	}

	 static int smallestNum(int t1,int t2,int t3) { //object call
		if(t1<=t2 && t1<=t3) // comparison
			return t1;
			else if (t2<=t1 && t2<=t3)
				return t2;
			else if (t3<=t2 && t3<=t1)
				return t3;
		return t1;
	
		
	}
	

}
