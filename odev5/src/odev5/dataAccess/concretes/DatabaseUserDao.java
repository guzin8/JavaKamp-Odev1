package odev5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import odev5.dataAccess.abstracts.UserDao;
import odev5.entities.concretes.User;

public class DatabaseUserDao implements UserDao {
	
	ArrayList<User> users = new ArrayList();
	

	@Override
	public void add(User user) {
		
		System.out.println("Kullanýcý eklendi: " + user.getFirstName() + " " + user.getLastName());
		users.add(user);
			
	}

	@Override
	public void delete(User user) {
		
		System.out.println("Kullanýcý silindi: " + user.getFirstName() + " " + user.getLastName());
		users.remove(user.getId());
			
	}

	@Override
	public void update(User user) {
		
		System.out.println("Kullanýcý güncellendi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public User get(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

}
