package lab_13_april_2023;

import java.util.ArrayList;

public class OddNumbers {
    
     ArrayList<Integer> A1;
     ArrayList<Integer> A2;
    
     ArrayList<Integer> storeOddNumbers(int N) {
        A1 = new ArrayList<>();
        for(int i = 2; i <= N; i += 2) {
            A1.add(i);
        }
        return A1;
    }
    
     ArrayList<Integer> printOddNumbers() {
        A2 = new ArrayList<>();
        for(int i = 0; i < A1.size(); i++) {
            int num = A1.get(i) * 5;
            A2.add(num);
            System.out.print(num);
            if(i < A1.size()-1) {
                System.out.print(",");
            }
        }
        System.out.println();
        return A2;
    }
    
     int  retrieveOddNumber(int N) {
        if(A1.contains(N)) {
            return N;
        }
        return 0;
    }
     
        
        public static void main(String[] args) {
            
            // Create an instance of the OddNumbers class
            OddNumbers oddNumbers = new OddNumbers();
            
            // Test the storeOddNumbers() method
            ArrayList<Integer> A1 = oddNumbers.storeOddNumbers(10);
            System.out.println("A1: " + A1);
            
            // Test the printOddNumbers() method
            ArrayList<Integer> A2 = oddNumbers.printOddNumbers();
            System.out.println("A2: " + A2);
            
            // Test the retrieveOddNumber() method
            int num1 = oddNumbers.retrieveOddNumber(4);
            System.out.println("Number found: " + num1);
            int num2 = oddNumbers.retrieveOddNumber(5);
            System.out.println("Number found: " + num2);
        }
    }



