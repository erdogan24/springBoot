package com.bookstore.demo.Repository;

import com.bookstore.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository <Book, Long> {

}
