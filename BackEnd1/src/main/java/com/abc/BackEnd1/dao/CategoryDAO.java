package com.abc.BackEnd1.dao;

import java.util.List;

import com.abc.BackEnd1.model.Category;

public interface CategoryDAO 
{
	boolean addCategory(Category c);
	boolean delCategory(String CId);
	boolean updCategory(Category c);
	Category getCategoryByCId(String CId);
	List<Category> getAllCategory();
}