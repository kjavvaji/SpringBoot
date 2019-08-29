package com.learn.io;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class DeleteTestCase extends EmployeeSpringBootApplicationTests{
	@Test
	public void delTest() throws Exception {
		MvcResult mvcResult = mockMvc.perform( // using mock mvc builder we can handle the mockMvc
				MockMvcRequestBuilders.delete("/employees/0").accept(MediaType.APPLICATION_JSON)
						.content("{\n" + "	\"eName\":\"Hello\",\n" + "	\"tech\":\"JUnit\"\n" + "}")
						.contentType(MediaType.APPLICATION_JSON))
				.andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		assertEquals(200, response.getStatus(),200); // HttpStatus.OK.value()=200, HttpStatus.CREATED.value()=201
		System.out.println("Response:" + response.getContentAsString());
		System.out.println(HttpStatus.OK.value());
	}
	
}
