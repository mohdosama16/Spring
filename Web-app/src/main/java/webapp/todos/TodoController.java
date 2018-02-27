package webapp.todos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

	@Autowired
	TodoService s;
	@RequestMapping(value ="/todo-list", method = RequestMethod.GET)
	public String Calltodo(ModelMap map){
		map.addAttribute("todos",s.retrieveTodos("in28Minutes"));
		return"todo-list";
	}
	@RequestMapping(value ="/add-todo", method = RequestMethod.GET)
	public String Newtodo(ModelMap map){
		map.addAttribute("todos",s.retrieveTodos("in28Minutes"));
		return"newtodo";
	}
	
	@RequestMapping(value ="/add-todo", method = RequestMethod.POST)
	public String Newtodoto(@RequestParam String desc){
		s.addTodo("in28Minutes", desc, new Date(), false);
		
		return"redirect:todo-list";
}
}