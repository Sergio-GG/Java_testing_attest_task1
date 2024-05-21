package org.example.service;

import org.example.model.LibraryUnit;
import org.example.repository.LibraryRepository;

import java.util.List;

public class LibraryService {

    private LibraryRepository libraryRepository;

    public LibraryService() {
        this.libraryRepository = new LibraryRepository();
    }

    public List<LibraryUnit> showUnits(){
        return libraryRepository.getLibraryUnits();
    }

    public void addUnit(LibraryUnit libraryUnit){
        libraryRepository.addUnit(libraryUnit);
    }

    public void deleteUnitByName(String name){
        libraryRepository.deleteLibraryUnitByName(name);
    }

    public LibraryUnit showUnitById(int id){
        return libraryRepository.getUnitById(id);
    }

    public List<LibraryUnit> showUnitsByAuthor(String author){
        return libraryRepository.getLibraryUnitsByAuthor(author);
    }
}
