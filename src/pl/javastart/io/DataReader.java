package pl.javastart.io;

import pl.javastart.model.Book;
import pl.javastart.model.Magazine;

import java.util.Scanner;

public class DataReader {
    Scanner sc = new Scanner(System.in);

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Book readAndCreateBook() {
        System.out.println("Podaj tytuł");
        String title = sc.nextLine();
        System.out.println("Podaj autora");
        String author = sc.nextLine();
        System.out.println("Podaj datę wydania");
        int releaseDate = getInt();
        System.out.println("Podaj ilość stron");
        int pages = getInt();
        System.out.println("Podaj nazwę wydawcy");
        String publisher = sc.nextLine();
        System.out.println("Podaj nr ISBN");
        String isbn = sc.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine(){
        System.out.println("Podaj tytuł");
        String title = sc.nextLine();
        System.out.println("Podaj wydawcę");
        String publisher = sc.nextLine();
        System.out.println("Podaj język");
        String language = sc.nextLine();
        System.out.println("Podaj rok wydania");
        int releaseYear = getInt();
        System.out.println("Podaj miesiąc wydania");
        int releaseMonth = getInt();
        System.out.println("Podaj dzień wydania");
        int releaseDat = getInt();

        return new Magazine(title, publisher, language, releaseYear, releaseMonth, releaseDat);
    }

}
