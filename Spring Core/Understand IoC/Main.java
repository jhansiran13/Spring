import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        // Here, the 'Sim' interface type 's' can hold an instance of 'Airtel'.

        // This demonstrates polymorphism, a core concept related to IoC,

        // where the specific implementation (Airtel) is 'injected' or assigned.

        // Sim s = new Airtel();

        // s.calling(); // Calls Airtel's calling() method

        // s.data();    // Calls Airtel's data() method

        // System.out.println("\n--- Switching to Jio ---");

        // // You can easily switch the implementation without changing the calling code.

        // s = new Jio(); // Now 's' holds an instance of 'Jio'

        // s.calling();   // Calls Jio's calling() method

        // s.data();      // Calls Jio's data() method



        ApplicationContext applicationContext 
        = new ClassPathXmlApplicationContext("beans.xml");
        
        // Get the bean
        Sim sim = applicationContext.getBean("sim", Sim.class);
        
        // Calling the methods
        sim.calling();
        sim.data();
    }

}