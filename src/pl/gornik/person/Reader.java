package pl.gornik.person;

import pl.gornik.library.Book;

import java.util.ArrayList;
import java.util.List;

public class Reader  extends Person {
    private List<Book> borrowedBooks;


    public Reader(String name, String surname, String pesel) {
        super(name, surname, pesel);
        this.borrowedBooks = new ArrayList<>();
    }
    public void borromBook(Book book){
        if(book.isAvailable()){
            book.borromBook();
            borrowedBooks.add(book);
            System.out.println("Książka została wypożyczona");
        }else{
            System.out.println("Książka nie była dostępna w bibliotece");
        }
    }
    public void returnBook(Book book){
        if(borrowedBooks.contains(book)){
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.printf("Książka %S została zwrócona \n", book.getTitle());
        }
        else {
            System.out.printf("Czytelnik nie wypożyczał ksiązki %S \n", book.getTitle());
        }
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ", wypozyczone książki " + borrowedBooks;
    }
}
