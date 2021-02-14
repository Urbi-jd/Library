package pl.javastart.model;

public class Library {

    private final static int MAX_BOOKS = 1000;
    private final static int MAX_MAGAZINES = 1000;

    Book[] books = new Book[MAX_BOOKS];
    Magazine[] magazines = new Magazine[MAX_MAGAZINES];

    private int booksNumber;
    private int magazineNumber;

    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else
            System.out.println("Maksymalna ilość książek");
    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            if (i < booksNumber) {
                books[i].printInfo();
            }
        }
    }

    public void addMagazine(Magazine magazine){
        if(magazineNumber < MAX_MAGAZINES){
            magazines[magazineNumber] = magazine;
            magazineNumber++;
        }
    }

    public void printMagazines(){
        for (Magazine magazine : magazines) {
            if(magazine != null)
            magazine.printInfo();
        }
    }

//        books[0] = new Book(
//                "W pustyni i w puszczy",
//                "Henryk Sienkiewicz",
//                2010,
//                296,
//                "Greg",
//                "9788373271890");
//
//        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009, 352, "Helion",
//                "9788324620845");
//
//        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",
//                2008, 851, "McGraw-Hill Osborne Media");
//
//        for (int i = 0; i < books.length; i++) {
//            if(books[i] != null)
//            books[i].printInfo();
//        }
//
//        DataReader dr = new DataReader();
//        books[3] = dr.addBook();
//
//        for (int i = 0; i < books.length; i++) {
//            if(books[i] != null)
//                books[i].printInfo();
//        }
//
//        int[] numbers = new int[25];


}
