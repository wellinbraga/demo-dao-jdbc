package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1 findAll() === ");
		List<Department> dep = departmentDao.findAll();
		for(Department list : dep) {
			System.out.println(list);
		}
		
		System.out.println();
		System.out.println("=== TESTE 2 finDyId() === ");
		Department dep1 = departmentDao.findById(2);
		System.out.println(dep1);
		
		System.out.println();
		System.out.println("=== TESTE 3 insert() === ");
		Department newDepartment = new Department(null, "Novo Departamento");
		departmentDao.insert(newDepartment);
		System.out.println("Done!");
		
		
		System.out.println();
		System.out.println("=== TESTE 4 update() === ");
		Department dep2 = departmentDao.findById(2);
		dep2.setName("Alterado");
		departmentDao.update(dep2);
		System.out.println("Done!");
		
		System.out.println();
		System.out.println("=== TESTE 5 delete() === ");
		System.out.println("Enter id for delete testes: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed!");
		
		sc.close();
	}

}
