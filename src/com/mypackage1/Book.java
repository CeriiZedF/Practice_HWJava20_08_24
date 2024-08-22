package com.mypackage1;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pages;

    public Book() {
        this.title = "";
        this.author = "";
        this.year = 0;
        this.publisher = "";
        this.genre = "";
        this.pages = 0;
    }

    public Book(String title, String author, int year, String publisher, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void inputBookData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title: ");
        this.title = scanner.nextLine();
        System.out.print("Enter author: ");
        this.author = scanner.nextLine();
        System.out.print("Enter year: ");
        this.year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter publisher: ");
        this.publisher = scanner.nextLine();
        System.out.print("Enter genre: ");
        this.genre = scanner.nextLine();
        System.out.print("Enter number of pages: ");
        this.pages = scanner.nextInt();
    }

    public void displayBookData() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
        System.out.println("Pages: " + pages);
    }

    public void displayBookData(String format) {
        if ("short".equalsIgnoreCase(format)) {
            System.out.println("Title: " + title + ", Author: " + author);
        } else if ("detailed".equalsIgnoreCase(format)) {
            displayBookData();
        } else {
            System.out.println("Unknown format.");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return year == book.year &&
                pages == book.pages &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                publisher.equals(book.publisher) &&
                genre.equals(book.genre);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + year;
        result = 31 * result + publisher.hashCode();
        result = 31 * result + genre.hashCode();
        result = 31 * result + pages;
        return result;
    }
}
