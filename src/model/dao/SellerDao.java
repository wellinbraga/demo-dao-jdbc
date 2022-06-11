package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	void insert(Seller obj);
	void update(Seller obj);
	void delete(Seller obj);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartament(Department dep);


}
