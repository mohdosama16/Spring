package webapp.Spring;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("mohd") && password.equals("usama");
	}

}