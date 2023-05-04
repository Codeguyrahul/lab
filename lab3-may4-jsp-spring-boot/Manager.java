package springlifecycle_lab3;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {
  
    public void doWork() {
        System.out.println("Manager is managing the team.");
    }
}

