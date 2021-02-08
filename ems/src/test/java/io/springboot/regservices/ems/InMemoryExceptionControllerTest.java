package io.springboot.regservices.ems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import io.springboot.regservices.ems.hello.HelloController;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
public class InMemoryExceptionControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void exceptions() throws Exception{
        final RequestBuilder request = MockMvcRequestBuilders.get("/hello");
        final MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Hello", result.getResponse().getContentAsString());

    }

 
}