package pl.gornik.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void showAllBooks(){
        System.out.println("Lista książek znajdujących sie w bibliotece");
        for(Book book : books){
            System.out.println(book);
        }
        System.out.println("=========================");
    }
    public void showAvailableBooks(){
        System.out.println("Lista dostępnych książek znajdujących sie w bibliotece");
        for(Book book : books){
            if(book.isAvailable()) {
                System.out.println(book);
            }
        }
        System.out.println("=========================");
    }

    public List<Book> searchBook(String type){
        List<Book> booksInType = new ArrayList<>();
        for(Book book: books){
            if(book.getType().getName().equals(type)) booksInType.add(book);
        }
         return booksInType;
    }

    public List<Book> searchBookByAuthor(String author){
        List<Book> booksInType = new ArrayList<>();
        for(Book book: books){
            if(book.getAuthor().equals(author)) booksInType.add(book);
        }
        return booksInType;
    }

    public List<Book> searchBookByTitle(String title){
        List<Book> booksInType = new ArrayList<>();
        for(Book book: books){
            if(book.getTitle().equals(title)) booksInType.add(book);
        }
        return booksInType;
    }

    public void removeBooksYear(int year){
        for(Book book : books){
            if(year == book.getYearOfPublication()) books.remove(book);
        }
    }

}
