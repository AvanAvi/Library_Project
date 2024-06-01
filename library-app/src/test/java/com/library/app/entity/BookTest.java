package com.library.app.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testBookCreation() {
        // Arrange
        Long id = 1L;
        String title = "Test Book";
        String author = "Test Author";
        String isbn = "1234567890";
        int publicationYear = 2023;

        // Act
        Book book = new Book(id, title, author, isbn, publicationYear);

        // Assert
        assertEquals(id, book.getId());
        assertEquals(title, book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(isbn, book.getIsbn());
        assertEquals(publicationYear, book.getPublicationYear());
    }
}