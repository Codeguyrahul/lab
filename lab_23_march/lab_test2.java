package lab_23_march;
import java.util.Scanner;

public class lab_test2 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the value of a");
	        int a = sc.nextInt();
	        System.out.println("enter the value of b");
	        int b = sc.nextInt();

	        try {
	            if ( a < 0 || b < 0) {
	                throw new Exception("x and y should not be negative");
	            } else if (a == 0 || b == 0) {
	                throw new Exception("x and y should not be zero");
	            } else {
	                System.out.println(a * b);
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}



