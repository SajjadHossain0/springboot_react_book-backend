package com.example.springboot_react;
import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAllBooks();
    Optional<Book> getBookById(Long id);
    Book createBook(Book book);
    Book updateBook(Long id, Book bookDetails);
    void deleteBook(Long id);
}
