package nLayeredInfo.core;

import java.util.regex.Pattern;

import nLayeredInfo.entities.concretes.User;

public class CheckManager implements CheckService{

	private CheckEmailService checkEmailService;
	
	
	public CheckManager(CheckEmailService checkEmailService) {
		this.checkEmailService = checkEmailService;
	}

	@Override
	public boolean checkPassword(User user) {
		{
			if (user.getPassword().length() >= 6) {
				return true;
			}
			System.out.println("Şifre en az 6 karekterden oluşmalıdır");
			return false;
		}
	}

	@Override
	public boolean checkEmail(User user) {
		return checkEmailService.checkEmail(user);
	}

	@Override
	public boolean checkName(User user) {
		
		if((user.getFirstName().length()>2) && (user.getLastName().length()>2)) {
			return true;
		}
		System.out.println("ad soyad en az 2 karekterden oluşmalıdır");
		return false;
	}

}
