package com.example.SpringBootAssign;
	import org.springframework.web.bind.annotation.*;
	import java.util.*;

	@RestController
	public class AccountController {

	    @GetMapping("/users/{id}/accounts")
	    public List<Account> getAccounts(
	            @PathVariable String id,
	            @RequestParam String type,
	            @RequestParam String status) {

	        Account acc1 = new Account(id, type, status);
	        return List.of(acc1);
	    }
	}

