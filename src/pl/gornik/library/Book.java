package pl.gornik.library;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private Genre type;
    private boolean isAvailable;

    public Book(String title, String author, int yearOfPublication, Genre type) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.type = type;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Genre getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borromBook(){
        if(isAvailable){
            isAvailable = false;
        }
        else{
            System.out.println("Książka " + title + " nie jest dostępna");
        }
    }
    public void returnBook(){
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", type=" + type +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
