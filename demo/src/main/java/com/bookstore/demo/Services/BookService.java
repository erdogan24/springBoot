package com.bookstore.demo.Services;

import com.bookstore.demo.model.Book;
import java.util.List;

public interface BookService {

    List<Book> getAllBook();
    void delete(long id);
    Book registerABook(Book book);
    Book update(Book book);
}

