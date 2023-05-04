package springlifecycle_lab3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class MainEmployee {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee m = context.getBean(Manager.class);
        m.doWork();
        Employee a = context.getBean(Accountant.class);
         a.doWork();
    }
}





