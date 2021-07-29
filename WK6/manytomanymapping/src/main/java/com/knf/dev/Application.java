package com.knf.dev;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.knf.dev.model.Author;
import com.knf.dev.model.Book;
import com.knf.dev.repository.BookRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book();
		Set<Author> authorList = new HashSet<>();
		Author author1 = new Author();
		author1.setFirstName("Adharsh");
		author1.setLastName("RJ");
		authorList.add(author1);
		book.setAuthors(authorList);
		book.setIsbn("98546RDR");
		book.setPublisher("Adharsh");
		book.setTitle("Many to Many");
		bookRepository.save(book);

	}
}
