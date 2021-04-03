package tacos;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.web.servlet.MockMvc;
//import tacos.web.HomeController;

//@WebMvcTest(HomeController.class)   // <1>
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;   // <2>, mockMvc will be assigned as been in context because of Autowired

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))    // <3>

                .andExpect(status().isOk())  // <4>

                .andExpect(view().name("home"))  // <5>

                .andExpect(content().string(           // <6>
                        containsString("Welcome to...")));
    }

}