package es.codeurjc.librored.repository;

import es.codeurjc.librored.model.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findTop10ByTitleContainingIgnoreCase(String q);
}
