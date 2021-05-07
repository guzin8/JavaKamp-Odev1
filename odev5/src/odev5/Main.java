package odev5;

import odev5.business.abstracts.UserService;
import odev5.business.concretes.UserManager;
import odev5.core.GoogleAccountAdapter;
import odev5.core.ValidationEmailManager;
import odev5.dataAccess.concretes.DatabaseUserDao;
import odev5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {		
		UserService userService = new UserManager(new DatabaseUserDao(), new GoogleAccountAdapter(), new ValidationEmailManager());
		
		User user1 = new User(1, "Güzin", "Kanburoglu", "kanburogluguzin@gmail.com", "1234687");
		userService.add(user1);
		
		User user2 = new User(2, "Nursima", "Kanburoglu", "kanburogluguzin@gmail.com", "32468796");
		userService.add(user2);
	}

}
