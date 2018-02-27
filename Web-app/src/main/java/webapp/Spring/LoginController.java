package webapp.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller   
public class LoginController {
	@Autowired
	LoginService S;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String ShowLogin(ModelMap Model) {
		Model.put("name", "in28Minutes");
		return "welcome";
	}
	
	/*@RequestMapping(value = "/login", method = RequestMethod.POST)

	public String HandleLogin(@RequestParam String name,@RequestParam String password, ModelMap Model) {
	if(!S.validateUser(name,password)) {
		return"Login";
	}	
		Model.put("name", name);
	   return "welcome";
	} */
	
} 
