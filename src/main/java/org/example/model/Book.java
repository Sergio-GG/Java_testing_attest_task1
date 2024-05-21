package org.example.model;

public class Book extends LibraryUnit{

    public Book(String name, String author) {
        super(name, author);
    }

    @Override
    public void getInfo() {
        System.out.println("Library Book");;
    }
}
