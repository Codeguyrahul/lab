package lab;
class Employee{
	 int IncrementSalary(){
	return 0;
	}
}
class Developer extends Employee{
	int  IncrementSalary(){
		return 10000;
			
			}
}class Manager extends Employee{
	int  IncrementSalary(){
		return 15000;
			
			}
}

public class Employeer_Overiding {
public static void main(String[] args) {
	Employee employee;
	employee=new Developer();
	System.out.println(employee.IncrementSalary());
	employee=new Manager();
	System.out.println(employee.IncrementSalary());
}
}
