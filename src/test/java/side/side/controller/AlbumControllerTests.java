package side.side.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@EnableWebMvc
public class AlbumControllerTests {
    MockMvc mockMvc;

    @Autowired
    WebApplicationContext webApplicationContext;

    @BeforeEach
    void beforeEach() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        System.out.println("Begin Test");
    }

    @Test
    void HomePage() throws Exception {
        System.out.println("Begin HomePage Test");
        mockMvc.perform(get("/")).andExpect(status().isOk());
        System.out.println("Finished HomePage Test");
    }
}
