package lab;
class  bank{
	int	getRateOfInterest() {
			 return 0;
	 }
}
class SBI extends bank{
 

int	getRateOfInterest(){

		return 8;
	}
}

class ICIC extends bank{
	 
int	getRateOfInterest(){

		return 7;
	}
}
class AXIC extends bank{
	 

int	getRateOfInterest(){

		return 9;
	}
}

public class Method_Lab {
	public static void main(String[] args) {
	bank	Bank;
	Bank=new SBI();
	System.out.println("SBI Rate of Interest: "+Bank.getRateOfInterest());
	Bank=new ICIC();
	System.out.println("SBI Rate of Interest: "+Bank.getRateOfInterest());
	Bank=new AXIC();
	System.out.println("SBI Rate of Interest: "+Bank.getRateOfInterest());
	}

}
