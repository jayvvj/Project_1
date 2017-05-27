package com.abc.BackEnd1.dao;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abc.BackEnd1.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sf;
	
	@Override
	public boolean addCategory(Category c) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(c);
		t.commit();
		return true;
	}

	@Override
	public boolean delCategory(String CId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Category c = s.get(Category.class, CId);
		if(c!=null)
			s.delete(c);
		else
			return false;
		t.commit();
		return true;
	}

	@Override
	public boolean updCategory(Category c) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(c);
		t.commit();
		return true;
	}

	@Override
	public Category getCategoryByCId(String CId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Category c = s.load(Category.class, CId);
		t.commit();
		return c;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getAllCategory() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		List<Category> list = s.createQuery("from Category").list();
		t.commit();
		return list;
	}

}
