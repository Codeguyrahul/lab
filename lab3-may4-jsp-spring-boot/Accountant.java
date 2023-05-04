package springlifecycle_lab3;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee {
 
    public void doWork() {
        System.out.println("Accountant is doing the books.");
    }
}

