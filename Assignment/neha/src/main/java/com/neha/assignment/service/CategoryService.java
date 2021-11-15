package com.neha.assignment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neha.assignment.entity.Category;
import com.neha.assignment.repository.CategoryRepository;

@Service("CategoryService")
public class CategoryService {
//
	@Autowired
	private CategoryRepository repo;

	public Optional<Category> findOne(int categoryCode) {
		return repo.findById(categoryCode);
	}

	public void updateCategory(int categoryCode, int newValue) {
		Category category = findOne(categoryCode).get();
		category.setCategoryValue(newValue);
		repo.save(category);
	}
}
