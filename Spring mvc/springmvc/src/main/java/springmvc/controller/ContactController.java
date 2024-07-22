package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userServie;
	
	// @ModelAttribute on class is used to add common things to all views
	@ModelAttribute
	public void commonForModel(Model model) {
		model.addAttribute("head", "LearnCode with Anisha");
		model.addAttribute("desc", "This is home for programmer");
	}
	
	@RequestMapping("contact")
	public String showForm() {
		return "contact";
	}
	
/*	
 * FIRST WAY - 
	//if required="false" : means the feild is optional 
	// by defalut the required is true
	 * 
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(
			@RequestParam(name="email", required=true) String userEmail, 
			@RequestParam("username") String userName,
			@RequestParam("password") String userPassword, Model model) {
		
		System.out.println("user email : "+userEmail);
		System.out.println("user name : "+ userName);
		System.out.println("user password : "+ userPassword);
		
		model.addAttribute("name", userName);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);
		
		return "success";
	}
*/

/*
	@RequestMapping(path="processform" , method=RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String email,
			@RequestParam("username") String username,
			@RequestParam("password") String password, Model model){
		
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		user.setUsername(username);;
		
		System.out.println(user);
		
		model.addAttribute("user", user);
		return "success";
	}
*/
	
	@RequestMapping(path="processform" , method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model){
		
		System.out.println(user);
		this.userServie.createUser(user);
		return "success";
	}
}
