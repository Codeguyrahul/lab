package method;

public class Student1 {//define class
		 int rollno;  
		 String name;  
		 void para(int r, String n){  // parameters r& n
		  rollno=r;  
		  name=n;  
		 }  
		 void show(){System.out.println(rollno+" "+name);}  
		}  
		class Student{  
		 public static void main(String args[]){  // main class
		  Student1 s1=new Student1();  
		  Student1 s2=new Student1();  
		  s1.para(111,"Karan");  // call parameter
		  s2.para(222,"Aryan");  
		  s1.show();  
		  s2.show();  
		 }  
}

