package org.example.model;

public class Microfilm extends LibraryUnit{
    public Microfilm(String name, String author) {
        super(name, author);
    }
    @Override
    public void getInfo() {
        System.out.println("Library Microfilm");
    }
}
