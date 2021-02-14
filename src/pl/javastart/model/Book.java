package pl.javastart.model;

public class Book extends Publication{

//    private String title;
    private String author;
//    private int releaseDate;
    private int pages;
//    private String publisher;
    private String isbn;

//    public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
//        this(title, author, releaseDate, pages, publisher);
//        this.isbn = isbn;
//    }

    public Book(String title,  String author, int year, int pages, String publisher,String isbn) {
        super(year, title, publisher);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }
//    public Book(String title, String author, int releaseDate, int pages, String publisher) {
//        this.title = title;
//        this.author = author;
//        this.releaseDate = releaseDate;
//        this.pages = pages;
//        this.publisher = publisher;
//    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printInfo() {
        String resoult = "title: " + getTitle() +
                ", author: " + author +
                ", releaseDate: " + getYear() +
                ", pages: " + pages +
                ", publisher: " + getPublisher();
        if (isbn != null) {
            resoult += ", isbn: " + isbn;
        }
        System.out.println(resoult);
    }
}
