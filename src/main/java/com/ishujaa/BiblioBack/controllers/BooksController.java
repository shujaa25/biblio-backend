package com.ishujaa.BiblioBack.controllers;

import com.ishujaa.BiblioBack.dto.BookDTO;
import com.ishujaa.BiblioBack.model.BookEntity;
import com.ishujaa.BiblioBack.services.BookService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//OPERATIONS
// GET /books - list of all books
// GET /books/{id} - book by id
// POST /books - add a book
// PUT /books/{id} - update
// DELETE /books/{id} - delete
// GET /books/search?q= - search by title or author
// GET /books/available - only available books

@RestController
@RequestMapping(path = "/books")
public class BooksController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookDTO> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookDTO getBookById(@PathVariable("id") Integer id){
        return bookService.getBookById(id);
    }

    @PostMapping
    public BookDTO addBook(@RequestBody BookDTO bookDTO){
        return bookService.addBook(bookDTO);
    }

    @PutMapping("/{id}")
    public BookDTO updateBook(@RequestBody BookDTO bookDTO,
                              @PathVariable("id") Integer id){
        return bookService.updateBook(bookDTO, id);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteBook(@PathVariable("id") Integer id){
        return bookService.deleteBook(id);
    }

    @GetMapping("/search")
    public List<BookDTO> search(@RequestParam("q") String query){
        return bookService.search(query);
    }

}
