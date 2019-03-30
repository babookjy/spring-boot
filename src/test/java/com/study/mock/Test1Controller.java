/**
 * 간단한 MockMvc 테스트
 * */
package com.study.mock;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.study.boot.rest.WelcomeController;

@RunWith(SpringRunner.class)
@WebMvcTest(Test1Controller.class)
@ContextConfiguration(classes = {WelcomeController.class}) 
public class Test1Controller {
	
	@Autowired
	private MockMvc mock;
	
	@Test
	public void welcome() throws Exception {
		/*MvcResult result = mock.perform(
				get("/welcome").accept(APPLICATION_JSON)
		)
		.andExpect(status().isOk())
		.andExpect(
				content().string(
						CoreMatchers.containsString("Hello World")
					)
			)
		.andReturn();
		
		System.out.println(result.getResponse().getContentAsString());*/
	}
}
