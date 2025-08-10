package com.example.SpringBootAssign;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class TestController {

	    // This will redirect to /example/test2
	    @GetMapping("/example/test")
	    public String redirectToTest2() {
	        return "redirect:/example/test2";
	    }

	    // This is the final endpoint that returns a message
	    @GetMapping("/example/test2")
	    public String finalPage() {
	        return "✅ This is final response from /example/test2";
	    }
	}

