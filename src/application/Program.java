package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department department = new Department(10, "TESTE 10");
		Seller seller = new Seller(1, "Vendedor 1", "vendedor@gmail.com", new Date(),3500.00, department);
		
		System.out.println(department);
		System.out.println(seller);

	}

}
