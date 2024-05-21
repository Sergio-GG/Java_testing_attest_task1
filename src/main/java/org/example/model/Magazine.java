package org.example.model;

public class Magazine extends LibraryUnit{
    public Magazine(String name, String author) {
        super(name, author);
    }

    @Override
    public void getInfo() {
        System.out.println("Library Magazine");
    }
}
