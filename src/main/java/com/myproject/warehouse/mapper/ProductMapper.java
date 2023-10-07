package com.myproject.warehouse.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.myproject.warehouse.domain.Product;

@Mapper
public interface ProductMapper {
	
	@Select("SELECT * FROM PRODUCT")
	Product[] selectProducts();

}
