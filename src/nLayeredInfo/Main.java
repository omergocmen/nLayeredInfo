package nLayeredInfo;

import java.util.regex.Pattern;

import nLayeredInfo.business.abstracts.ProductService;
import nLayeredInfo.business.concretes.ProductManager;
import nLayeredInfo.core.CheckEmailService;
import nLayeredInfo.core.CheckManager;
import nLayeredInfo.core.CheckService;
import nLayeredInfo.core.GoogleRegisterManagerAdapter;
import nLayeredInfo.core.RegexCheckManagerAdapter;
import nLayeredInfo.core.RegisterService;
import nLayeredInfo.core.jLoggerManagerAdapter;
import nLayeredInfo.dataAccess.concretes.HibernateProducutDao;
import nLayeredInfo.entities.concretes.Product;
import nLayeredInfo.entities.concretes.User;
import nLayeredInfo.google.GoogleRegisterManager;

public class Main {
	public static void main(String[] args) {
		/*ProductService productService=new ProductManager(new HibernateProducutDao(),new jLoggerManagerAdapter());
		productService.add(new Product(1,2,"elma",12,50)); yandaki kodlar product için yazýlmýþtýr*/
	
		
		
		
		
		
		User user =new User(1,"omer","gocmen","omergocmen@gmail.com","125663");
		
		CheckEmailService checkEmailService=new RegexCheckManagerAdapter();
		CheckService checkService = new CheckManager(checkEmailService);
		GoogleRegisterManager googleRegisterManager=new GoogleRegisterManager();
		RegisterService registerService=new GoogleRegisterManagerAdapter(googleRegisterManager,checkService);
		registerService.registerUser(user);
		
		/*Yukarýda kurmuþ olduðum yapýda bir checkManager sýnýfý var ve CheckService interface'inden implemente ediyor
		 CheckService içerisinde isim,soyisim,sifre ve email onaylama gibi method referanslarý tutuluyor
		 checkManager'ýn içerisinde bu methodlar ve kontroller yazýlýyor ancak email kýsmýnda 
		 regex kullandýðýmýz için ayriyeten bir RegexCheckManagerAdapter adýnda bir adapter oluþturdum
		 bu regex kodlarýný kullanarak email'in doðruluðunu kontrol ediyor bu sýnýfta emailCheckService'i
		 implemente ediyor emailCheckService'de ise sadece email kontrol var bunu yapmamýn sebebi
		 ileride regex deðilde baþka bir email kontrol paketiyle çalýþýlýrsa sorun yaþanmasýn
		 yani þifre,ad,soyad direkt implemente edilip yazýlmýþtý email ise adapter ve service yapýsýyla
		 ayriyeten CheckManager sýnýfýnda çaðrýlýyor 
		 
		 Google ile oturum açmak için ise google adlý bir paket oluþturdum ve içine googleRegisterManager adlý 
		 bir sýnýf koydum burada simülasyon yaptým içerisinde sadece google ile oturum açtý yazan bir method var
		 bu paketi dýþardan aldýðýmýzý varsayararak onun içinde bir GoogleRegisterManagerAdapter
		 adýnda adapter yazdým bu adapter googleRegisterManager yani dýþardan kullandýðýmýz paketi çalýþtýrýyordu
		 ve RegisterService'i implemente ediyordu
		 
		 En sonunda register yaparken iki tane parametre alýyor biri hangi register yoluyla register olduðu
		 diðer ise email kontrolü için hangi paketin kullanýlmasý gerektiði ile ilgili umarým baþarýlý olmuþtur.
		 
		  
		  */
		
		
		
		
		
	}
}
