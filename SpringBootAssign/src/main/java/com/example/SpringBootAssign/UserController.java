package com.example.SpringBootAssign;
	import com.example.demo.model.User;
	import org.springframework.web.bind.annotation.*;

	@RestController
	public class UserController {

	    @PostMapping("/users")
	    public String createUser(@RequestBody User user) {
	        return "User Received: " + user.getFirstName() + " " + user.getLastName() + ", Age: " + user.getAge();
	    }
	}

