package lab_13_april_2023;

import java.util.ArrayList;

public class person{
	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		
		// add element in arraylist
		al.add("Riya");
		al.add("Himanshu");
		al.add("Shivani");
		al.add("Neha");
		al.add("Raman");
		al.add("Shivam");
		al.add("Krishna");
		al.add("Mukul");
		al.add("Praveen");
		al.add("Isha");
		
		//using for each loop
		System.out.println("ArrayList Element List:");
		for(String i:al) {
			System.out.println(i);
		}
	}
}
