package tacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TacoCloudApplication { // Bootstrap Class

    public static void main(String[] args) {

        // performs the actual bootstrapping of the application,
        // creating the Spring application context.
        // The two parameters passed to the run() method are a configuration class and the command-line arguments
        SpringApplication.run(TacoCloudApplication.class, args);

    }

}
