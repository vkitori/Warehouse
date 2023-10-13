package com.myproject.warehouse.domain;

import java.sql.Timestamp;
import java.time.Instant;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@EntityScan
public class Product {
	
	@Nullable
	private Integer id;
	@NonNull
	private String name;
	@Nullable
	private String description;
	@Nullable
	private int available; 
	@Nullable
	private Timestamp createdAt;
	
	public Product(Integer id, String name, String description, int available, Timestamp createdAt) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.available = available;
		this.createdAt = Timestamp.from(Instant.now());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	

}
