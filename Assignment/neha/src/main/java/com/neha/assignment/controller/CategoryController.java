package com.neha.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.neha.assignment.entity.Category;
import com.neha.assignment.model.CategoryInputBody;
import com.neha.assignment.model.Response;
import com.neha.assignment.service.CategoryService;

@CrossOrigin(origins = "*")
@RestController
public class CategoryController {

	@Autowired
	private CategoryService service;

	@Autowired
	private ObjectMapper mapper;

	@RequestMapping("/FetchNextNumber")
	public Response fetchNextNumber(@RequestBody String paramBody) {
		Response response = new Response();
		try {
			CategoryInputBody body = mapper.readValue(paramBody, CategoryInputBody.class);
			int categoryId = body.getCategoryCode();
			Category category = service.findOne(categoryId).get();
			int oldValue = category.getCategoryValue();
			response.setOldValue(category.getCategoryValue());
			Thread.sleep(5000);
			int newValue = oldValue + 9;
			response.setNewValue(newValue);
			service.updateCategory(categoryId, newValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;

	}

}
