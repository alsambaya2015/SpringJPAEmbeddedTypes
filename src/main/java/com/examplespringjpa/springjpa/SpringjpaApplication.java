package com.examplespringjpa.springjpa;


import com.examplespringjpa.springjpa.model.Address;
import com.examplespringjpa.springjpa.model.Name;
import com.examplespringjpa.springjpa.model.User;
import com.examplespringjpa.springjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringjpaApplication implements CommandLineRunner {



	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringjpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Cleanup the users table
		userRepository.deleteAllInBatch();

		// Insert a new user in the database
		Name name = new Name("Baya", "Mohamed", "Ben");
		Address address = new Address("669", "View Street", "Montreal", "Quebec", "Canada", "L5T666");
		User user = new User(name, "example@gmail.com", address);

		userRepository.save(user);
	}


}
