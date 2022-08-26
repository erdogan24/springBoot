package com.bookstore.demo.Controller;

import com.bookstore.demo.Services.BookService;
import com.bookstore.demo.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {



    final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/ınsertBook")
    public ResponseEntity<?> register(@RequestBody Book book){
        bookService.registerABook(book);
        return ResponseEntity.ok().body(book);
    }

    @PutMapping("/updateBook/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Book id, @RequestBody Book book) {
        Book bookUpdate = bookService.registerABook(id);
        return ResponseEntity.ok().body(bookUpdate);

    }
    @GetMapping("/getBook")
    public ResponseEntity<?> getAllBook() {
        return ResponseEntity.ok(bookService.getAllBook());
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<?> delete(@PathVariable()long id) {
        bookService.delete(id);
        return ResponseEntity.ok().body("İşlem Tamamlandı.");

    }

}
