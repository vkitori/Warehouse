package com.myproject.warehouse.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.myproject.warehouse.domain.Product;

@Mapper
public interface ProductMapper {
	
	@Select("SELECT * FROM PRODUCT ")
	Product[] selectProducts();
	
	@Select("SELECT ID, NAME, DESCRIPTION, AVAILABLE FROM PRODUCT WHERE ID = #{id}")
	Product selectProductById(int id);
	
	@Insert("INSERT INTO PRODUCT (NAME, DESCRIPTION, AVAILABLE) VALUES (#{name}, #{description}, #{available})")
	int addProduct(Product product);
	
	@Update("UPDATE PRODUCT SET NAME = #{name}, DESCRIPTION = #{description}, AVAILABLE = #{available} WHERE ID = #{id}")
	int updateProductById(Product product);
	
	@Delete("DELETE FROM PRODUCT WHERE ID = #{id}")
	int deleteProductById(int id);

}
