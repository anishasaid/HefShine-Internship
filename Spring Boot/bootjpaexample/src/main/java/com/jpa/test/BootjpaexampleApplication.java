package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication(scanBasePackages = "com.jpa.test")
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =  SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		user.setName("Anisha Said");
//		user.setCity("Pune");
//		user.setStatus("I am java programmer");
//		***save one user ***
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
/*
		//create object of user
		User user1 = new User();
		user1.setName("Uttam");
		user1.setCity("Mumbai");
		user1.setStatus("Python programmer");
		
		User user2 = new User();
		user2.setName("Apeksha");
		user2.setCity("Badlapur");
		user2.setStatus("Chemist Analyst");
		
		//*** save multiple users ***
		List<User> users = List.of(user1, user2); // this is from java 9
		Iterable<User> result = userRepository.saveAll(users); // insert in db
		
		result.forEach(user->{
			System.out.println(user);
		});
		
		System.out.println("done");
*/
/*	
		// *** Update Operation *** 
		Optional<User> optional = userRepository.findById(2);
		User user = optional.get();
		user.setName("Pritam");
		User result = userRepository.save(user);
		System.out.println(result);
		
		//*** how to get data ***
		//findById(id) - Optional Containing your data
		
		//findAll ()
		 
		List<User> list = userRepository.findAll();
		Iterator<User> itr = list.iterator();
		while(itr.hasNext()) {
			User userr = itr.next();
			System.out.println(userr);
		}
		
		System.out.println("********** OR  ********************");
		
		list.forEach(user1->{
			System.out.println(user1);
		});
*/

/*
		// How to delete data
		userRepository.deleteById(52);
		System.out.println("deleted");
*/
		
		// *** Custom Finder Method ***
		List<User> user = userRepository.findByName("Anisha Said");
		user.forEach(u->{
			System.out.println(u);
		});
		
		List<User> listuser = userRepository.findByNameAndCity("Apeksha", "Badlapur");
		listuser.forEach(ul->{
			System.out.println(ul);
		});
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		List<User> cuser = userRepository.findByCityStartingWith("P");
		cuser.forEach(c->{
			System.out.println(c);
		});
	}

}
