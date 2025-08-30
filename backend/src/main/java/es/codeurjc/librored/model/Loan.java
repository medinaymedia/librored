package es.codeurjc.librored.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "loan", indexes = {
        @Index(name = "idx_loans_user", columnList = "user_id"),
        @Index(name = "idx_loans_book", columnList = "book_id"),
        @Index(name = "idx_loans_start", columnList = "startDate")
})
public class Loan {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_loans_user"))
    private User user;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_loans_book"))
    private Book book;

    @Column(nullable = false)
    private LocalDate startDate;

    private LocalDate endDate;

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }
}
