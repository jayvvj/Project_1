package com.abc.BackEnd1.dao;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abc.BackEnd1.model.Supplier;

@Repository
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sf;
	
	@Override
	public boolean addSupplier(Supplier p) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(p);
		t.commit();
		return true;
	}

	@Override
	public boolean delSupplier(String SId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Supplier p = s.get(Supplier.class, SId);
		if(p!=null)
			s.delete(p);
		else
			return false;
		t.commit();
		return true;
	}

	@Override
	public boolean updSupplier(Supplier sup) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(sup);
		t.commit();
		return true;
	}

	@Override
	public Supplier getSupplierBySId(String SId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Supplier sup = s.load(Supplier.class, SId);
		t.commit();
		return sup;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Supplier> getAllSupplier() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		List<Supplier> list = s.createQuery("from Supplier").list();
		t.commit();
		return list;
	}
}