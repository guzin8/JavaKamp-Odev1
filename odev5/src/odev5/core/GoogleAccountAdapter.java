package odev5.core;

import odev5.googleAccount.GoogleAccountManager;

public class GoogleAccountAdapter implements GoogleRegisterService {

	@Override
	public void registerToSystem(String email) {
		
		GoogleAccountManager googleAccountManager = new GoogleAccountManager();
		googleAccountManager.register(email);
		
	}

}
