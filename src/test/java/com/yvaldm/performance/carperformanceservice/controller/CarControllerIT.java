package com.yvaldm.performance.carperformanceservice.controller;

import com.yvaldm.performance.carperformanceservice.config.TestEmbeddedConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@Import({TestEmbeddedConfig.class})
@SpringBootTest
@Transactional
@AutoConfigureMockMvc
public class CarControllerIT {

    @Autowired
    private MockMvc mvc;

    @Test
    public void shouldCreateCar() throws Exception {

        mvc.perform(post("/cars")
                            .content("{ \"id\": \"2\", " +
                                             "   \"code\": \"rdb1\", " +
                                             "   \"transmission\": \"automatic\", " +
                                             "   \"ai\": \"enabled\", " +
                                             "   \"max-speed\": { " +
                                             "    \"unit\": \"mps\", " +
                                             "    \"value\": 110.12121212 " +
                                             "   } }")
                            .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());
    }
}