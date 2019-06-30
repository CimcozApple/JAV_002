package lesson04.homework;

public class Book {
    private String titleOfBook;
    private String bookAuthor;
    private String publishingHouse;
    private String typeOfBinding;
    private int bookID;
    private int yearOfPublishing;
    private int howManyPages;
    private double bookPrice;

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String title) {
        this.titleOfBook = title;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getHowManyPages() {
        return howManyPages;
    }

    public void setHowManyPages(int howManyPages) {
        this.howManyPages = howManyPages;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Book() {

    }

    public Book(String titleOfBook, String bookAuthor, String publishingHouse, String typeOfBinding, int bookID, int yearOfPublishing, int howManyPages, double bookPrice) {
        this.titleOfBook = titleOfBook;
        this.bookAuthor = bookAuthor;
        this.publishingHouse = publishingHouse;
        this.typeOfBinding = typeOfBinding;
        this.bookID = bookID;
        this.yearOfPublishing = yearOfPublishing;
        this.howManyPages = howManyPages;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleOfBook = '" + titleOfBook + '\'' +
                ", bookAuthor = '" + bookAuthor + '\'' +
                ", publishingHouse = '" + publishingHouse + '\'' +
                ", typeOfBinding = '" + typeOfBinding + '\'' +
                ", bookID = " + bookID +
                ", yearOfPublishing = " + yearOfPublishing +
                ", howManyPages = " + howManyPages +
                ", bookPrice = " + bookPrice +
                '}';
    }
}