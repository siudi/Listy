package pl.gornik.person;

public class Librarian extends Person{
    private double salary;

    public Librarian(String name, String surname, String pesel, double salary) {
        super(name, surname, pesel);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Librarian{" + super.toString() +
                "salary=" + salary +
                '}';
    }
}
