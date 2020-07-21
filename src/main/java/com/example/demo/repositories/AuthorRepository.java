package com.example.demo.repositories;

import com.example.demo.domain.Author;

import org.springframework.data.repository.CrudRepository;

// CrudRepository takes in Type and ID
// This will give us save / save all / find by id / find all / delete / etc
public interface AuthorRepository extends CrudRepository<Author, Long> {

}