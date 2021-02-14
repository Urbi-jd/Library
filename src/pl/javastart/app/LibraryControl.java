package pl.javastart.app;

import pl.javastart.io.DataReader;
import pl.javastart.model.Library;

public class LibraryControl {
    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int ADD_MAGAZINE = 2;
    private static final int PRINT_BOOKS = 3;
    private static final int PRINT_MAGAZINES = 4;

    private DataReader dataReader = new DataReader();

    private Library library = new Library();

    public void menu() {

        int option;

        do {
            printOpions();

            option = dataReader.getInt();

            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_MAGAZINES:
                    printMagazine();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Zły wybór. Podaj ponownie");
            }
        } while (option != 0);
    }

    private void printMagazine() {
        System.out.println("");
        System.out.println("Magazyny w bibliotece");
        library.printMagazines();
        System.out.println("");
    }

    private void exit() {
        System.out.println("Do widzenia");
        dataReader.close();
    }

    private void printBook() {
        System.out.println("");
        System.out.println("Książki w bibliotece");
        library.printBooks();
        System.out.println("");
    }

    private void addBook() {
        library.addBook(dataReader.readAndCreateBook());
    }

    private void addMagazine(){
        library.addMagazine(dataReader.readAndCreateMagazine());
    }

    private void printOpions() {
        System.out.println("Wybierz opcję:");
        System.out.println("Wybierz " + ADD_BOOK + " aby dodać książkę");
        System.out.println("Wybierz " + ADD_MAGAZINE + " aby dodać czasopismo");
        System.out.println("Wybierz " + PRINT_BOOKS + " aby wyświetlić wszystkie książki");
        System.out.println("Wybierz " + PRINT_MAGAZINES + " aby wyświetlić wszystkie czasopisma");
        System.out.println("Wybierz " + EXIT + " aby zamknąć program");
    }

}
