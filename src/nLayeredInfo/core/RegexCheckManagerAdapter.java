package nLayeredInfo.core;

import nLayeredInfo.entities.concretes.User;
import java.util.regex.Pattern;


public class RegexCheckManagerAdapter implements CheckEmailService {

	@Override
	public boolean checkEmail(User user) {
		String mailRegex="(.+)@(.+)$";
        Pattern pattern= Pattern.compile(mailRegex);
            if (!pattern.matcher(user.getEmail()).matches() || user.getEmail().isEmpty() || user.getEmail()== null){
                System.out.println("Bu mail kabul edilebilir deðil.");
                return false;
        }
        return true;
	}

}
