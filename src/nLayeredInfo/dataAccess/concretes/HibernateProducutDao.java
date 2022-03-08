package nLayeredInfo.dataAccess.concretes;

import java.util.List;

import nLayeredInfo.dataAccess.abstracts.ProductDao;
import nLayeredInfo.entities.concretes.Product;

public class HibernateProducutDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile eklendi "+product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("Hibernate ile güncellendi "+product.getName());
	}

	@Override
	public void delete(Product product) {
		System.out.println("Hibernate ile silindi "+product.getName());
	}

	@Override
	public Product get(int id) {
		System.out.println("Hibernate ile gönderildi ");
		return null;
	}

	@Override
	public List<Product> getAll() {
		System.out.println("Hibernate ile gönderildiler ");
		return null;
	}

}
