package pl.javastart.io;

import pl.javastart.model.Book;

import java.util.Scanner;

public class DataReader {
    Scanner sc = new Scanner(System.in);

    public Book addBook(){
        System.out.println("Podaj tytół");
        String title = sc.nextLine();
        System.out.println("Podaj autora");
        String author = sc.nextLine();;
        System.out.println("Podaj datę wydania");
        int releaseDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj ilość stron");
        int pages = sc. nextInt();
        sc.nextLine();
        System.out.println("Podaj nazwę wydawcy");
        String publisher = sc.nextLine();;
        System.out.println("Podaj nr ISBN");
        String isbn = sc.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

}
