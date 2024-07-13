package com.mcit.DTOPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mcit.DTOPractice.model.Location;
import com.mcit.DTOPractice.model.User;
import com.mcit.DTOPractice.repository.LocationRepository;
import com.mcit.DTOPractice.repository.UserRepository;

@SpringBootApplication
public class DtoPracticeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtoPracticeApplication.class, args);
	}

	@Autowired
	public UserRepository userRepository;

	@Autowired
	public LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location1 = new Location();
		location1.setPlace("Kabul");
		location1.setDescription("Kabul is the Capital");
		location1.setLongitude(4152.25);
		location1.setLatitude(5566.22);
		locationRepository.save(location1);

		Location location2 = new Location();
		location2.setPlace("Herat");
		location2.setDescription("Herat is a clean city");
		location2.setLongitude(7788.33);
		location2.setLatitude(4411.22);
		locationRepository.save(location2);

		User user1 = new User();
		user1.setFirstName("Jan");
		user1.setLastName("Khan");
		user1.setEmail("amin@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location1);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Gul");
		user2.setLastName("Mir");
		user2.setEmail("mir@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location2);
		userRepository.save(user2);

		User user3 = new User();
		user3.setFirstName("Ahmad");
		user3.setLastName("Rahimi");
		user3.setEmail("rahimi@gmail.com");
		user3.setPassword("secret");
		user3.setLocation(location2);
		userRepository.save(user3);


	}

}
