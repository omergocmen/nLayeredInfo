package nLayeredInfo.dataAccess.concretes;

import java.util.List;

import nLayeredInfo.dataAccess.abstracts.ProductDao;
import nLayeredInfo.entities.concretes.Product;

public class AbsProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Abs ile eklendi "+product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("Abs ile güncellendi "+product.getName());
	}

	@Override
	public void delete(Product product) {
		System.out.println("Abs ile silindi "+product.getName());
	}

	@Override
	public Product get(int id) {
		System.out.println("Abs ile gönderildi ");
		return null;
	}

	@Override
	public List<Product> getAll() {
		System.out.println("Abs ile gönderildiler ");
		return null;
	}


}
