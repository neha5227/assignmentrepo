package com.neha.assignment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int categoryCode;

	@Column(name = "categoryValue")
	private int categoryValue;

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public int getCategoryValue() {
		return categoryValue;
	}

	public void setCategoryValue(int categoryValue) {
		this.categoryValue = categoryValue;
	}

}