package com.example.Readerly.Repositories;

import com.example.Readerly.Entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
