package nLayeredInfo.core;

import nLayeredInfo.entities.concretes.User;

public interface CheckService {
	boolean checkPassword(User user);
	boolean checkEmail(User user);
	boolean checkName(User user);
}
