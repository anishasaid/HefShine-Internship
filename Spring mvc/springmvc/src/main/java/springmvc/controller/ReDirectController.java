package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReDirectController {

	//redirect view by using -> redirect prefix 
	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one handler");
		return "redirect:/two";
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is two handler");
		return "";
	}
	
	// Redirect view by using -> RedirectView
	@RequestMapping("/three")
	public RedirectView three() {
		
		System.out.println("This is three handler");
		RedirectView r = new RedirectView();
		r.setUrl("four");
		//r.setUrl("https://www.google.com");
		return r;
	}
	
	@RequestMapping("/four")
	public String four() {
		System.out.println("This is four handler");
		return "";
	}
	
}
