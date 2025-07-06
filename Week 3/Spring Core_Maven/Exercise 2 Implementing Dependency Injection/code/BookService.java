package org.example.service;

import org.example.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // 1 usage
    public void setBookRepository(BookRepository bookRepository) {
        // no usages
        this.bookRepository = bookRepository;
    }
    public void addBook(String bookName){
        System.out.println("Book Added: " + bookName);
        bookRepository.saveBook(bookName);


    }
}
