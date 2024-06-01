package com.library.app.entity;

public class Book {
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;

    // Setter methods
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}