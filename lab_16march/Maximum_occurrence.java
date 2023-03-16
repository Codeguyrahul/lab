package lab_16march;

public class Maximum_occurrence {
	public static void main(String[] args) {
	int max;//local variable
	String str="Welcome to java World";//string
	char ch[]= new char[str.length()];//length of character number
	char maxchar=ch[0];//length of character
	ch=str.toCharArray();
	int[] number= new int[str.length()];//number of character
	for(int i=0;i<str.length();i++) {//outer loop 
		number[i]=1;
		for(int j=0;j<str.length();j++) {//inner loop for increment the number of letter
	if(ch[i]==ch[j]&& ch[i]!=' ') {
		number[i]++;
	}}}
	 max=number[0];
	for(int i=0;i<number.length;i++) {//loop for print maximum character
		if(max<number[i]) {
	max=number[i];
	maxchar=ch[i];
	}}
	System.out.println("maximum character:"+maxchar);//to print the maximum character
}
}