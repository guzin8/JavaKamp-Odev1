package odev5.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import odev5.business.abstracts.UserService;
import odev5.core.GoogleRegisterService;
import odev5.core.ValidationEmailService;
import odev5.dataAccess.abstracts.UserDao;
import odev5.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private GoogleRegisterService googleRegisterService;
	private ValidationEmailService validationEmailService;
	
	public UserManager(UserDao userDao, GoogleRegisterService googleRegisterService, ValidationEmailService validationEmailService) {
		super();
		this.userDao = userDao;
		this.googleRegisterService = googleRegisterService;
		this.validationEmailService = validationEmailService;
	}

	@Override
	public void add(User user) {
		
		if(user.getPassword().length()<6) {
			
			System.out.println("Parola en az 6 karakterden olu�mal�d�r!");
			return;
		}
			
			String regex = "^[a-zA-Z0-9_!#$%&�*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(user.getEmail());
			
			if(!matcher.matches()) {
				
				System.out.println("Ge�ersiz mail adresi!");	
				return;
				
			}
			
			for(User user1 : userDao.getAll()) {
				
				if(user1.getEmail() == user.getEmail()) {
					 
					System.out.println("Mail adresi daha �nce kullan�lm��t�r. Yeni bir mail adresi giriniz.");
					return;
				}
				
			}
			
			if(!(user.getFirstName().length()>=2 && user.getLastName().length()>=2)) {
				
				System.out.println("�sim ve soyisim en az 2 karakterden olu�mal�d�r.");
				return;
				
			}
			
			if(validationEmailService.getClick() == false) {
				
				System.out.println("Kullan�c� kayd� ba�ar�s�z.");
				return;
				
			}
			
			userDao.add(user);
			googleRegisterService.registerToSystem(user.getEmail());
			return;	
	
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

}
