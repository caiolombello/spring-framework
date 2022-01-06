package com.dio.springboottest.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class TestUnitController {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testInt() throws Exception {
        RequestBuilder request = get("/test");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Welcome, Caio", result.getResponse().getContentAsString());
    }

    @Test
    public void testIntWithArgs() throws Exception {
        mvc.perform(get("/test?name=Renan"))
                .andExpect(content().string("Welcome, Renan"));
    }

}
