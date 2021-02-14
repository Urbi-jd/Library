package pl.javastart.model;

public class Magazine extends Publication{

    private int month;
    private int day;
    private String language;

    public Magazine(String title, String publisher, String language, int year, int month, int day) {
        super(year, title, publisher);
        this.month = month;
        this.day = day;
        this.language = language;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void printInfo() {
        String resoult = "title: " + getTitle() +
                ", publisher: " + getPublisher() +
                ", language: " + getLanguage() +
                ", release year: " + getYear() +
                ", release month: " + month +
                ", release day: " + day;

        System.out.println(resoult);
    }
}
