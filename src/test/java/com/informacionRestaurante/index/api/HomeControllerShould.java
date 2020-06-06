package com.informacionRestaurante.index.api;

import com.informacionRestaurante.index.controller.ControllerHome;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ControllerHome.class)
public class HomeControllerShould {

    @Autowired
    private MockMvc mvc;

    @Test
    void confirm_showIndex_should_return_204() throws Exception {
        mvc.perform(get("/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void confirm_showIndex_should_return_HTML() throws Exception {
        mvc.perform(get("/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @Test
    void confirm_showIndex_with_non_existing_parameter_should_return_404() throws Exception {
        mvc.perform(get("/" + "algo")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    void confirm_showMenu_should_return_204() throws Exception {
        mvc.perform(get("/menu")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void confirm_showMenu_with_non_existing_parameter_should_return_404() throws Exception {
        mvc.perform(get("/menu" + "/algo")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}
