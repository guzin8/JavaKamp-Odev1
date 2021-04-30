package odev2;

public class UserManager {
	
	public void Login(int logType, User user) {
		
		if(logType == 1)
		    System.out.println("Ogrenci kayýt oldu : " + user.firstName);
		
		    else if(logType == 2)
	        System.out.println("Egitmen kayýt oldu : " + user.firstName);
					
	}
	
	public void Update(int logType, User user) {
		
		if(logType == 1)
			System.out.println("Ogrenci güncellendi : " + user.firstName);
			
			else if(logType == 2)
		    System.out.println("Egitmen güncellendi : " + user.firstName);
		
	}
	
    public void Delete(int logType, User user) {
		
    	if(logType == 1)
			System.out.println("Ogrenci silindi : " + user.firstName);
			
			else if(logType == 2)
		    System.out.println("Egitmen silindi : " + user.firstName);
		
	}

}
