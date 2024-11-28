package com.example.WeAreBooks.Repositories;

import com.example.WeAreBooks.Entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
