package com.learn.io;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.learn.io.repository.EmployeeRepo;

@RunWith(SpringRunner.class)
@WebMvcTest
public class EmployeeSpringBootApplicationTests {
	
	@Autowired
	MockMvc mockMvc;              //to use direct rest calls
	
	@MockBean
	EmployeeRepo employeeRepo;
	
	@Test
	public void contextLoads() throws Exception {
		
		 when(employeeRepo.findAll()).thenReturn(Collections.emptyList());
		
		MvcResult mvcResult= mockMvc.perform(                        //using mock mvc builder we can handle the mockMvc
				MockMvcRequestBuilders.get("/employees")
				.accept(MediaType.APPLICATION_JSON)
				).andReturn();
		
		System.out.println("Response:"+mvcResult.getResponse());

		verify(employeeRepo).findAll();
	}

}
