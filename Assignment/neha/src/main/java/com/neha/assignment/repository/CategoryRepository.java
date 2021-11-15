package com.neha.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neha.assignment.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
