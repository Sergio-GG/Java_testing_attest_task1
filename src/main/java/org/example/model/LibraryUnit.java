package org.example.model;

import java.util.concurrent.atomic.AtomicInteger;

public class LibraryUnit implements InfoInterface{
    int id;
    String name;
    String author;
    private static final AtomicInteger count = new AtomicInteger(0);

    public LibraryUnit(String name, String author) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "LibraryUnit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", unit='" + this.getClass().getSimpleName() + '\'' +
                '}';
    }

    @Override
    public void getInfo() {
        System.out.println("Library Unit");
    }
}
