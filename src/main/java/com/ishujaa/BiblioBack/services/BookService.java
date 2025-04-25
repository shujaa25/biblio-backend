package com.ishujaa.BiblioBack.services;

import com.ishujaa.BiblioBack.dto.BookDTO;
import com.ishujaa.BiblioBack.model.BookEntity;
import com.ishujaa.BiblioBack.repositories.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    private final ModelMapper modelMapper;

    //better to use constructor instead of Autowired
    //as vat must be final to avoid unnecessary modifications
    public BookService(BookRepository bookRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
    }

    public List<BookDTO> getAllBooks() {
        /*List<BookDTO> bookDTOList = new ArrayList<>();

        List<BookEntity> bookEntityList = bookRepository.findAll();
        for(BookEntity bookEntity : bookEntityList){
           BookDTO bookDTO = modelMapper.map(bookEntity, BookDTO.class);
           bookDTOList.add(bookDTO);
        }
        return bookDTOList;*/

        return bookRepository.findAll().stream()
                .map(bookEntity -> modelMapper.map(bookEntity, BookDTO.class))
                .toList();


    }

    public BookDTO addBook(BookDTO bookDTO){
//        BookEntity entity = modelMapper.map(bookDTO, BookEntity.class);

        BookEntity entity = new BookEntity(null, bookDTO.getTitle(), bookDTO.getAuthor(),
                bookDTO.getGenre(), bookDTO.getYear(), bookDTO.isAvailable());

        return modelMapper.map(bookRepository.save(entity), BookDTO.class);
    }

    public boolean deleteBook(Integer id) {
        boolean exists = bookRepository.existsById(id);
        if (exists) {
            bookRepository.deleteById(id);
        }
        return exists;
    }

    public BookDTO getBookById(Integer id) {
        return modelMapper.map(bookRepository.findById(id).orElse(new BookEntity()), BookDTO.class);
    }

    public BookDTO updateBook(BookDTO bookDTO, Integer id) {
        Optional<BookEntity> entity = bookRepository.findById(id);

        if(entity.isPresent()){
            BookEntity bookEntity = entity.get();
            bookEntity.setAuthor(bookDTO.getAuthor());
            bookEntity.setYear(bookDTO.getYear());
            bookEntity.setGenre(bookDTO.getGenre());
            bookEntity.setAvailable(bookDTO.isAvailable());
            bookEntity.setTitle(bookDTO.getTitle());
            return modelMapper.map(bookRepository.save(bookEntity), BookDTO.class);
            //bookRepository.flush(); //immediately make changes
        }

        return new BookDTO();
    }
}
