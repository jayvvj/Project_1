package com.abc.BackEnd1.dao;

import java.util.List;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.abc.BackEnd1.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	SessionFactory sf;
	
	@Override
	public boolean addCustomer(Customer c) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(c);
		t.commit();
		return true;
	}

	@Override
	public boolean delCustomer(String email) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Customer c = s.get(Customer.class, email);
		if(c!=null)
			s.delete(c);
		else
			return false;
		t.commit();
		return true;
	}

	@Override
	public boolean updCustomer(Customer c) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(c);
		t.commit();
		return true;
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Customer c = s.load(Customer.class, email);
		t.commit();
		return c;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomers() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		List<Customer> list = s.createQuery("from Customer").list();
		t.commit();
		return list;
	}

}
