package com.example.SpringBootAssign;
	import org.springframework.http.MediaType;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	import java.util.*;

	@RestController
	public class BookController {

	    @GetMapping(value = "/bookXYZ", produces = MediaType.APPLICATION_XML_VALUE)
	    public List<Book> getBooks() {
	        List<Book> books = new ArrayList<>();
	        books.add(new Book(101, "Java Tutorials", "Krishna"));
	        books.add(new Book(102, "Spring Tutorials", "Mahesh"));
	        books.add(new Book(103, "Angular Tutorials", "Shiva"));
	        return books;
	    }
	}

