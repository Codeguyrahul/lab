package lab_23_march;
import java.util.InputMismatchException;
import java.util.Scanner;
public class lab_test1 {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	        	System.out.println("enter the value of x");
	            int a = sc.nextInt();
	            System.out.println("enter the value of x");
	            int b = sc.nextInt();
	            int div = a / b;
	            System.out.println(div);
	        }  catch (ArithmeticException e) {
	            System.out.println("java.lang.ArithmeticException: " );
	        } 
	        catch (InputMismatchException e) {
	            System.out.println("java.util.InputMismatchException");
	        }
	    }
	}


