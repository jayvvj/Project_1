package com.abc.BackEnd1.dao;

import java.util.List;

import com.abc.BackEnd1.model.Product;

public interface ProductDAO
{
	boolean addProduct(Product p);
	boolean delProduct(String PId);
	boolean updProduct(Product p);
	Product getProductByPId(String PId);
	List<Product> getAllProduct();
}