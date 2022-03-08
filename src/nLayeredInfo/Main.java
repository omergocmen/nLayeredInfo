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
		productService.add(new Product(1,2,"elma",12,50)); yandaki kodlar product i�in yaz�lm��t�r*/
	
		
		
		
		
		
		User user =new User(1,"omer","gocmen","omergocmen@gmail.com","125663");
		
		CheckEmailService checkEmailService=new RegexCheckManagerAdapter();
		CheckService checkService = new CheckManager(checkEmailService);
		GoogleRegisterManager googleRegisterManager=new GoogleRegisterManager();
		RegisterService registerService=new GoogleRegisterManagerAdapter(googleRegisterManager,checkService);
		registerService.registerUser(user);
		
		/*Yukar�da kurmu� oldu�um yap�da bir checkManager s�n�f� var ve CheckService interface'inden implemente ediyor
		 CheckService i�erisinde isim,soyisim,sifre ve email onaylama gibi method referanslar� tutuluyor
		 checkManager'�n i�erisinde bu methodlar ve kontroller yaz�l�yor ancak email k�sm�nda 
		 regex kulland���m�z i�in ayriyeten bir RegexCheckManagerAdapter ad�nda bir adapter olu�turdum
		 bu regex kodlar�n� kullanarak email'in do�rulu�unu kontrol ediyor bu s�n�fta emailCheckService'i
		 implemente ediyor emailCheckService'de ise sadece email kontrol var bunu yapmam�n sebebi
		 ileride regex de�ilde ba�ka bir email kontrol paketiyle �al���l�rsa sorun ya�anmas�n
		 yani �ifre,ad,soyad direkt implemente edilip yaz�lm��t� email ise adapter ve service yap�s�yla
		 ayriyeten CheckManager s�n�f�nda �a�r�l�yor 
		 
		 Google ile oturum a�mak i�in ise google adl� bir paket olu�turdum ve i�ine googleRegisterManager adl� 
		 bir s�n�f koydum burada sim�lasyon yapt�m i�erisinde sadece google ile oturum a�t� yazan bir method var
		 bu paketi d��ardan ald���m�z� varsayararak onun i�inde bir GoogleRegisterManagerAdapter
		 ad�nda adapter yazd�m bu adapter googleRegisterManager yani d��ardan kulland���m�z paketi �al��t�r�yordu
		 ve RegisterService'i implemente ediyordu
		 
		 En sonunda register yaparken iki tane parametre al�yor biri hangi register yoluyla register oldu�u
		 di�er ise email kontrol� i�in hangi paketin kullan�lmas� gerekti�i ile ilgili umar�m ba�ar�l� olmu�tur.
		 
		  
		  */
		
		
		
		
		
	}
}
