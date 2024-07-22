package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// 4. Create Controller
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// Transfer data form Controller-View => by using model object
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		
		model.addAttribute("name", "ANISHA SAID");
		model.addAttribute("id", 12345);
		
		List<String> friends = new ArrayList<String> ();
		friends.add("Anisha");
		friends.add("Pritam");
		friends.add("Apeksha");
		friends.add("Shradhha");
		friends.add("Maitheeli");
		friends.add("Shravya");
		friends.add("Hardik");
		
		model.addAttribute("f", friends);
		
		return "index";
	}
	
	@RequestMapping("about")
	public String about() {
		System.out.println("This is about url");
		return "about";
	}
	
	@RequestMapping("service")
	public ModelAndView service() {
		System.out.println("This is services url");
		
		//create object of ModelAndView
		ModelAndView modelandview = new ModelAndView();
		
		//set vlaues
		modelandview.addObject("name", "Pritam Kohli");
		modelandview.addObject("age" , 34);
		
		
		//create list and send to view
		List<Integer> list = new  ArrayList<Integer>();
		list.add(19);
		list.add(11);
		list.add(15);
		list.add(10);
		list.add(16);
		list.add(31);
		modelandview.addObject("marks", list);
		
		//set view name
		modelandview.setViewName("service");
		
		return modelandview;
	}
	
	// Transfer data form Controller-View => by using ModelAndView object
	@RequestMapping("help")
	public ModelAndView help() {
		System.out.println("This is help url");
		
		//create Object of ModelAndView 
		ModelAndView mad = new ModelAndView();
		
		//set values
		mad.addObject("name", "Apeksha Deshmukh");
		mad.addObject("rollno", 19);
		mad.addObject("dob","19/11/1996" );
		
		LocalDateTime now =  LocalDateTime.now();
		mad.addObject("time", now);
		
		
		//set View 
		mad.setViewName("help");
		
		return mad;
	}
}
