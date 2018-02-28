package com.francosebastian.demo;

import com.francosebastian.demo.controller.PersonController;
import com.sun.deploy.net.HttpResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.io.IOException;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


	private final PersonController personController = new PersonController();
	private MockMvc mockMvc;
	private final String URL_BASE = "https://localhost:8090";


	@Test
	public void shouldReturnHttpCode200OnGetAllPersons() throws Exception {
		mockMvc.perform(get(URL_BASE+"/persons")).andExpect(status().isOk());
	}

	@Before
	public void beforeTest() {
		mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
	}


}
