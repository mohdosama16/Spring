package webapp.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginTable {
    @RequestMapping(value="/table", method=RequestMethod.GET)
	public String ShowLogin() {
		return"table";
		
	}
    @RequestMapping(value="/table", method=RequestMethod.POST)
	public String HandleLogin(@RequestParam String name,ModelMap M){
    	M.put("name", name);
		return"welcome";
		
	}
}
