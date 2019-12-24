package ru.mirea;

public class Book {
    private String name;
    private String author;
    private int pages;

    Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        if (pages > 0)
            this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPages(int pages) {
        if (pages > 0)
            this.pages = pages;
    }

    @Override
    public String toString() {
        return "Название книги: " + name + "\nАвтор: " + author + "\nКоличество страниц: " + pages;
    }
}
