package com.api.skyscanner.repo;

import com.api.skyscanner.domain.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
    Book findByAuthor(String author);

}
