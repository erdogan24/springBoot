package com.bookstore.demo.Services;

import com.bookstore.demo.Repository.BookRepository;
import com.bookstore.demo.model.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {
    private static final Logger log = LogManager.getLogger(BookServiceImpl.class);

    final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBook() {
        log.info("Tüm Kitaplar getirildi");
        return bookRepository.findAll();
    }

    @Override
    public void delete(long id) {
        log.info(id +" id ' li book silindi ! ");
        bookRepository.deleteById(id);
    }

    @Override
    public Book registerABook(Book book) {
        log.info("Book kaydı yapıldı.!"+book.toString());
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        log.info(" Book güncelendi.!"+book.toString());
        return bookRepository.save(book);
    }
}