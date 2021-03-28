package tacos;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class TacoCloudApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        String[] beans = applicationContext.getBeanDefinitionNames();
        for (String b : beans) {
            System.out.println(" *** " + b);
        }
    }

}
