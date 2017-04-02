package friendsofmine.controllers;

import friendsofmine.Bootstrap;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by Hades on 4/2/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UtilisateurControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Bootstrap bootstrap;

    @Test
    public void list() throws Exception {
        this.mockMvc.perform(get("/utilisateurs"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/html;charset=UTF-8"))
                .andExpect(view().name("utilisateurs"))
                .andExpect(content().string(Matchers.containsString("<h2>Liste des Utilisateurs</h2>")))
                .andDo(print());
    }

}