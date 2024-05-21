package org.example;

import org.example.model.Book;
import org.example.model.LibraryUnit;
import org.example.model.Magazine;
import org.example.model.Microfilm;
import org.example.service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryUnit book1 = new Book("Winnie-the-Pooh", "Alan Milne");
        LibraryUnit book2 = new Book("The Forsyte Saga", "John Galsworthy");
        LibraryUnit magazine1 = new Magazine("Wall Street", "Dow Jones & Company");
        LibraryUnit microfilm1 = new Microfilm("Singing in the Rain", "Gene Kelly");
        LibraryUnit microfilm2 = new Microfilm("Taxi Driver", "Martin Scorsese");

        LibraryService libraryService = new LibraryService();

        System.out.println(libraryService.showUnits());
        System.out.println("===================================================================================");
        libraryService.addUnit(book1);
        libraryService.addUnit(book2);
        libraryService.addUnit(magazine1);
        libraryService.addUnit(microfilm1);
        libraryService.addUnit(microfilm2);

        System.out.println(libraryService.showUnits());
        System.out.println("===================================================================================");
        System.out.println(libraryService.showUnitsByAuthor("Martin Scorsese"));
        System.out.println("===================================================================================");
        System.out.println(libraryService.showUnitById(1));
        System.out.println("===================================================================================");
        libraryService.deleteUnitByName("The Forsyte Saga");
        System.out.println(libraryService.showUnits());
        System.out.println("===================================================================================");
        libraryService.showUnitById(3).getInfo();

    }
}