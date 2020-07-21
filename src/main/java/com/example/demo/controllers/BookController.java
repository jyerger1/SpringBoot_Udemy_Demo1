package com.example.demo.controllers;

import com.example.demo.repositories.BookRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    // instance of book repository
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Will execute get books method / spring will provide in a model / and we are
    // using the repository to get a list of books out of the database / assign up
    // to the attribute of books on the model / and then returning back a string
    // called books which will tell Spring MVC we want to apply the view books
    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());

        return "books/list";
    }
}
