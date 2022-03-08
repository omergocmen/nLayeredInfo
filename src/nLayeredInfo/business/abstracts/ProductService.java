package nLayeredInfo.business.abstracts;

import java.util.List;

import nLayeredInfo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
	
	
}
