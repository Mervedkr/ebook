package com.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
}
