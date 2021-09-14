package com.reformix.springweb;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping("/books")
	public java.util.List<Book> getAllBooks() {
		
		
		
		return Arrays.asList(new Book(19l,"Angles & Demons","Dan Brown"));
	}

}
