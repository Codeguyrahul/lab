package lab_16march;

public class ReverseString {
	public static String reversechar(String str){ 
		
	    String words[]=str.split("\\s");  
    String reversechar=""; 
    
    
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reversechar+=sb.toString()+" ";  
        
    }  
    return reversechar.trim();  
}  
	public static void main(String[] args) {  
	    System.out.println( ReverseString.reversechar("Rawan belong to rajput"));  
	    System.out.println( ReverseString.reversechar("i am from uttarpradesh"));   
}  }


