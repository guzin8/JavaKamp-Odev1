package odev2;

public class UserManager {
	
	public void Login(int logType, User user) {
		
		if(logType == 1)
		    System.out.println("Ogrenci kay�t oldu : " + user.firstName);
		
		    else if(logType == 2)
	        System.out.println("Egitmen kay�t oldu : " + user.firstName);
					
	}
	
	public void Update(int logType, User user) {
		
		if(logType == 1)
			System.out.println("Ogrenci g�ncellendi : " + user.firstName);
			
			else if(logType == 2)
		    System.out.println("Egitmen g�ncellendi : " + user.firstName);
		
	}
	
    public void Delete(int logType, User user) {
		
    	if(logType == 1)
			System.out.println("Ogrenci silindi : " + user.firstName);
			
			else if(logType == 2)
		    System.out.println("Egitmen silindi : " + user.firstName);
		
	}

}
