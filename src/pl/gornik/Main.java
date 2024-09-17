package pl.gornik;

import pl.gornik.library.Book;
import pl.gornik.library.Genre;
import pl.gornik.library.Library;
import pl.gornik.person.Reader;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Pan Tadeusz","Adam Mickiewicz",1900, Genre.NOVEL);
        Book book2 = new Book("Quo Vadis","Henryk Sienkiewicz",1850, Genre.NOVEL);
        Book book3 = new Book("Drakula","Bram Stoker",1897, Genre.HORROR);
        Book book4 = new Book("Dom do wynajęcia","Marcel Moss",2003, Genre.CRIME);
        Book book5 = new Book("Pan Głębin","Małgorzata Paszko",2015, Genre.FANTASY);
        Book book6 = new Book("Wyspa","Natasha Preston",2020, Genre.THRILLER);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        Reader reader = new Reader("Kacper","Nowak","1237819287319");

        library.showAllBooks();
        System.out.println(reader);
        System.out.println("-------------------");
        reader.borromBook(book2);
        reader.borromBook(book4);
        System.out.println(reader);
        System.out.println("----------------------------------------");
        library.showAvailableBooks();

        reader.returnBook(book2);
        reader.returnBook(book5);
        library.showAvailableBooks();

        System.out.println("======================================");
        System.out.println("Jaką kategorie książek chcesz wyszukać?");
        Scanner scanner = new Scanner(System.in);
        String genre = scanner.nextLine();
        List<Book> foundBooks = library.searchBook(genre);
        if(!foundBooks.isEmpty()) {
            Iterator<Book> iterator = foundBooks.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
        else System.out.println("W bibliotece nie ma takiej kategorii");


    }
}