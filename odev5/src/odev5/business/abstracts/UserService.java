package odev5.business.abstracts;

import java.util.List;

import odev5.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	List<User> getAll();

}
