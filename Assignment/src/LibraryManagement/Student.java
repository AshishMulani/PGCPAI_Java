package LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public int id;
    public List<Book> issuedBooks;   // books currently held by this student

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.issuedBooks = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", issuedBooks=" + issuedBooks.size() +
                '}';
    }
}