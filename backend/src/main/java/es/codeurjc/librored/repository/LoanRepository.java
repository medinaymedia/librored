package es.codeurjc.librored.repository;

import es.codeurjc.librored.model.Loan;
import es.codeurjc.librored.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByUser(User user);
}
