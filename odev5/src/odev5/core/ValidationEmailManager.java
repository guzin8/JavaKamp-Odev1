package odev5.core;

public class ValidationEmailManager implements ValidationEmailService {

	@Override
	public void senToEmail() {
		
		System.out.println("Mail g�nderildi.");
		
	}

	@Override
	public boolean getClick() {
	
		return true;
	}

}
