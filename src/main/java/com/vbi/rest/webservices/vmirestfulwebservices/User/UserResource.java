package com.vbi.rest.webservices.vmirestfulwebservices.User;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserResource {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
    public List<User> index(){
        return userRepository.findAll();
    }
}
