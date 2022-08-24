package org.oukirche.ocp.model;

public class Book {
    private String name;
    private String authorname;
    private String year;
    private int price;
    private String isbn;

    public Book(String name, String authorname, String year, int price, String isbn) {
        this.name = name;
        this.authorname = authorname;
        this.year = year;
        this.price = price;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
