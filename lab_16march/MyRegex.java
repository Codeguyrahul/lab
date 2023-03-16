package lab_16march;
import java.util.regex.*;
import java.util.Scanner;

	public class MyRegex {
		    String pattern;

		    public MyRegex() {
		        pattern = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		    }
		    
		    public static void main(String[] args) {
		        MyRegex regex = new MyRegex();
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the ip Address:-");
		        while (sc.hasNext()) {
		            String ip = sc.next();
		            System.out.println(ip.matches(regex.pattern));
		        }
		}}




