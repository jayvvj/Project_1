package com.abc.BackEnd1.dao;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abc.BackEnd1.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sf;
	
	@Override
	public boolean addProduct(Product p) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(p);
		t.commit();
		return true;
	}

	@Override
	public boolean delProduct(String PId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Product p = s.get(Product.class, PId);
		if(p!=null)
			s.delete(p);
		else
			return false;
		t.commit();
		return true;
	}

	@Override
	public boolean updProduct(Product p) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(p);
		t.commit();
		return true;
	}

	@Override
	public Product getProductByPId(String PId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Product p = s.load(Product.class, PId);
		t.commit();
		return p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProduct() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		List<Product> list = s.createQuery("from Product").list();
		t.commit();
		return list;
	}
}
