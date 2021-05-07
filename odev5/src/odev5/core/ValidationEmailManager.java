package odev5.core;

public class ValidationEmailManager implements ValidationEmailService {

	@Override
	public void senToEmail() {
		
		System.out.println("Mail gönderildi.");
		
	}

	@Override
	public boolean getClick() {
	
		return true;
	}

}
