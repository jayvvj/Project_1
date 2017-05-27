package com.abc.BackEnd1.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import com.abc.BackEnd1.dao.CategoryDAO;
import com.abc.BackEnd1.dao.CategoryDAOImpl;
import com.abc.BackEnd1.dao.CustomerDAO;
import com.abc.BackEnd1.dao.CustomerDAOImpl;
import com.abc.BackEnd1.dao.ProductDAO;
import com.abc.BackEnd1.dao.ProductDAOImpl;
import com.abc.BackEnd1.dao.SupplierDAO;
import com.abc.BackEnd1.dao.SupplierDAOImpl;

@Configuration
@ComponentScan("com.abc.BackEnd1")
public class DBConfig {

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("org.h2.Driver");
	    dataSource.setUrl("jdbc:h2:tcp://localhost/~/db1");
	    dataSource.setUsername("sa");
	    dataSource.setPassword("");
	    return dataSource;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {

	    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);

	    //sessionBuilder.addAnnotatedClasses(User.class);
	    sessionBuilder.scanPackages("com.abc.BackEnd1");
	    sessionBuilder.addProperties(getProperties());
	    return sessionBuilder.buildSessionFactory();
	}
	
	private Properties getProperties(){
		Properties p = new Properties();
		p.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		p.put("hibernate.hbm2ddl.auto","update");
		p.put("hibernate.show_sql","true");
		return p;
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {

	    HibernateTransactionManager transactionManager = new   HibernateTransactionManager(sessionFactory);
	    return transactionManager;
	}
	
	@Autowired
	@Bean(name = "customerDAO")
	public CustomerDAO getCustomerDAO(){
		CustomerDAO cd = new CustomerDAOImpl();
		return cd;
	}
	
	@Autowired
	@Bean(name = "productDAO")
	public ProductDAO getProductDAO(){
		ProductDAO pd = new ProductDAOImpl();
		return pd;
	}
	
	@Autowired
	@Bean(name = "supplierDAO")
	public SupplierDAO getSupplierDAO(){
		SupplierDAO sd = new SupplierDAOImpl();
		return sd;
	}
	@Autowired
	@Bean(name = "categoryDAO")
	public CategoryDAO getCategoryDAO(){
		CategoryDAO catd = new CategoryDAOImpl();
		return catd;
	}  
}
