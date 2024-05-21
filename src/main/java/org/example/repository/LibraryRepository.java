package org.example.repository;

import org.example.model.LibraryUnit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryRepository {

    List<LibraryUnit> libraryUnits;

    public LibraryRepository() {
        this.libraryUnits = new ArrayList<>();
    }

    public void addUnit(LibraryUnit libraryUnit){
        libraryUnits.add(libraryUnit);
    }

    public LibraryUnit getUnitById(int id){
        return libraryUnits.stream()
                .filter(el -> el.getId() == id)
                .findFirst().orElse(null);
    }
    public List<LibraryUnit> getLibraryUnitsByAuthor(String author){
        return libraryUnits.stream()
                .filter(el -> el.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
    public void deleteLibraryUnitByName(String name){
        libraryUnits.removeIf(el -> el.getName().equals(name));
    }
    public List<LibraryUnit> getLibraryUnits(){
        return libraryUnits;
    }
}
