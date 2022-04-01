package com.pyxelart;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class SpringDocker1ApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	

	@Test
	void shouldResultTestResult() throws Exception {
		this.mockMvc.perform(get("/home"))
			.andExpect(status().is(404))
			.andExpect(content().string(containsString("test resul")));
	}

}
