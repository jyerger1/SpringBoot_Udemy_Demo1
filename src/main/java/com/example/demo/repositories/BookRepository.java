package com.example.demo.repositories;

import com.example.demo.domain.Book;

import org.springframework.data.repository.CrudRepository;

// CrudRepository takes in Type and ID
// This will give us save / save all / find by id / find all / delete / etc
public interface BookRepository extends CrudRepository<Book, Long> {

}