package nLayeredInfo.core;

import nLayeredInfo.entities.concretes.User;
import nLayeredInfo.google.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements RegisterService {

	private GoogleRegisterManager googleRegisterManager;
	private CheckService checkService;
	
	
	public GoogleRegisterManagerAdapter(GoogleRegisterManager googleRegisterManager,CheckService checkService) {
		super();
		this.googleRegisterManager = googleRegisterManager;
		this.checkService=checkService;
	}


	@Override
	public void registerUser(User user) {
		
		if(checkService.checkEmail(user) && checkService.checkName(user) && checkService.checkPassword(user)) {
			googleRegisterManager.register();
			System.out.println("Baþarýyla kayýt oldu.");
			return;
		}
	}
	
}
