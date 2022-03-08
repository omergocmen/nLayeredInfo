package nLayeredInfo.business.concretes;

import java.util.List;

import nLayeredInfo.business.abstracts.ProductService;
import nLayeredInfo.core.LoggerService;
import nLayeredInfo.dataAccess.abstracts.ProductDao;
import nLayeredInfo.entities.concretes.Product;


public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;	
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilemez. ");
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün baþarýyla eklendi "+product.getName());

	}

	@Override
	public List<Product> getAll() {
		return null;
	}



}
