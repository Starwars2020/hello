package com.springboot.hello;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerTests {

	@Autowired
	private MockMvc mockMvc;

	//@Test
	//public void noParamProductShouldReturnDefaultMessage() throws Exception {
  //
	//	this.mockMvc.perform(get("/product")).andDo(print()).andExpect(status().isOk())
	//			.andExpect(jsonPath("$.content").value("Hello, World"));
	//}

	//@Test
	//public void paramProductShouldReturnTailoredMessage() throws Exception {
  //
	//	this.mockMvc.perform(get("/product").param("number", 1))
	//			.andDo(print()).andExpect(status().isOk())
	//			.andExpect(jsonPath("$.content").value("Model3"));
	//}

}
