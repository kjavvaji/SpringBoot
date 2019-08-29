package com.learn.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.learn.io.repository.EmployeeRepo;

@RunWith(SpringRunner.class)
@WebMvcTest
public class EmployeeSpringBootApplicationTests {

	@Autowired
	MockMvc mockMvc; // to use direct rest calls

	@MockBean
	EmployeeRepo employeeRepo;

	@Test
	public void contextLoads() throws Exception {

		// when(employeeRepo.findAll()).thenReturn(Collections.emptyList());

//		MvcResult mvcResult= mockMvc.perform(                        //using mock mvc builder we can handle the mockMvc
//				MockMvcRequestBuilders.get("/employees")
//				.accept(MediaType.APPLICATION_JSON)
//				).andReturn();
//		
//		System.out.println("Response:"+mvcResult.getResponse());

		// verify(employeeRepo).findAll();
		/*---------------------------------*/
//		MvcResult mvcResult= mockMvc.perform(                        //using mock mvc builder we can handle the mockMvc
//				MockMvcRequestBuilders.post("/addEmployee")
//				.accept(MediaType.APPLICATION_JSON).content("{\n" + 
//						"	\"eName\":\"Hello\",\n" + 
//						"	\"tech\":\"JUnit\"\n" + 
//						"}")
//				.contentType(MediaType.APPLICATION_JSON)
//				).andReturn();
//		MockHttpServletResponse response=mvcResult.getResponse();
//		assertEquals(200,response.getStatus());  //response.getStatus()=201
//		System.out.println("Response:"+response.getContentAsString());
//		//assertEquals("http://localhost:8080/addEmployee",response.getHeader(HttpHeaders.LOCATION));
//	}

		/*---------------------------------*/
//		MvcResult mvcResult= mockMvc.perform(                        //using mock mvc builder we can handle the mockMvc
//				MockMvcRequestBuilders.put("/employees/0")
//				.accept(MediaType.APPLICATION_JSON).content("{\n" + 
//						"	\"eName\":\"Hello\",\n" + 
//						"	\"tech\":\"JUnit\"\n" + 
//						"}")
//				.contentType(MediaType.APPLICATION_JSON)
//				).andReturn();
//		MockHttpServletResponse response=mvcResult.getResponse();
//		assertEquals(200,response.getStatus());  //response.getStatus()=201
//		System.out.println("Response:"+response.getContentAsString());
//	}
		/*---------------------------------*/
//		MvcResult mvcResult= mockMvc.perform(                        //using mock mvc builder we can handle the mockMvc
//				MockMvcRequestBuilders.delete("/employees/0")
//				.accept(MediaType.APPLICATION_JSON).content("{\n" + 
//						"	\"eName\":\"Hello\",\n" + 
//						"	\"tech\":\"JUnit\"\n" + 
//						"}")
//				.contentType(MediaType.APPLICATION_JSON)
//				).andReturn();
//		MockHttpServletResponse response=mvcResult.getResponse();
//		assertEquals(200,response.getStatus());  //response.getStatus()=201
//		System.out.println("Response:"+response.getContentAsString());
	}

}
