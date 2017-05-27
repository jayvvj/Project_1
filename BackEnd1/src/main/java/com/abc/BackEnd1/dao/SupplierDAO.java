package com.abc.BackEnd1.dao;

import java.util.List;

import com.abc.BackEnd1.model.Supplier;

public interface SupplierDAO
{
	boolean addSupplier(Supplier s);
	boolean delSupplier(String SId);
	boolean updSupplier(Supplier s);
	Supplier getSupplierBySId(String SId);
	List<Supplier> getAllSupplier();
}