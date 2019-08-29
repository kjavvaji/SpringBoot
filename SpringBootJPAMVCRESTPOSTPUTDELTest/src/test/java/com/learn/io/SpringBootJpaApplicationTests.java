package com.learn.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
		classes = SpringBootJpaApplication.class
	
	)
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:application.properties")
public class SpringBootJpaApplicationTests {

	@Autowired
	MockMvc mockMvc;              //to use direct rest calls
	
	@Test
	public void contextLoads() throws Exception {
		
		MvcResult mvcResult= mockMvc.perform(                        
				MockMvcRequestBuilders.get("/aliens")
				.accept(MediaType.APPLICATION_JSON)
				).andReturn();
		
		String expected="[{\"aid\":101,\"aName\":\"FirstPerson\",\"tech\":\"Java\"},{\"aid\":102,\"aName\":\"SecondPerson\",\"tech\":\"Android\"},{\"aid\":103,\"aName\":\"ThirdPerson\",\"tech\":\"C\"},{\"aid\":104,\"aName\":\"FourthPerson\",\"tech\":\"Mech\"}]";
		JSONAssert.assertEquals(expected, mvcResult.getResponse().getContentAsString(),false);
		System.out.println("Response:"+mvcResult.getResponse());
		
	}


}
