package com.myproject.warehouse.service;

import org.springframework.stereotype.Service;

import com.myproject.warehouse.domain.Product;
import com.myproject.warehouse.mapper.ProductMapper;

@Service
public class ProductService {
	
	private ProductMapper productMapper;

	public ProductService(ProductMapper productMapper) {
		super();
		this.productMapper = productMapper;
	}
	
	public Product[] getProducts() {
		
		Product[] products = productMapper.selectProducts(); 
		return products;
		
	}
	
	public Product getProductById(int id) {
		
		return productMapper.selectProductById(id);
	}
	
	public int addProduct(Product product) {
		
		return productMapper.addProduct(product);
		
	}
	
	public int updateProductById(Product product) {
		
        return productMapper.updateProductById(product);
        
    }
	
	public int deleteProductById(int id) {
		
        return productMapper.deleteProductById(id);
        
    }

}
