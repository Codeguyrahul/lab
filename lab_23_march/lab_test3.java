package lab_23_march;
import java.util.Scanner;
public class lab_test3 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the value of a ");
	        int a = sc.nextInt();
	        System.out.println("enter the value of b");
	        int b = sc.nextInt();

	        try {
	            int add = addTwoPositive(a, b);
	            System.out.println("The sum of " + a + " and " + b + " is " + add);
	        } catch (ArithmeticException e) {
	            System.out.println(e);
	        }
	    }

	    public static int addTwoPositive(int a, int b) {
	        if (a <= 0 || b <= 0) {
	            throw new ArithmeticException("Non-positive integer sent");
	        }
	        return a + b;
	    }
	}


