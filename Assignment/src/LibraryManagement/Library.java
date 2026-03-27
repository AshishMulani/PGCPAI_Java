package LibraryManagement;

import LibraryManagement.CustomExceptions.OutOfStockException;
import LibraryManagement.CustomExceptions.StudentNotFoundException;

import java.util.ArrayList;

public class Library {

        ArrayList<Book> booklist = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

public void addbook(){
        booklist.add(new Book("TinyDrama", "Dhriti", 4));
        booklist.add(new Book("Lovelife", "Ash", 6));
        booklist.add(new Book("AboveTheSky", "Pranita", 2));
        booklist.add(new Book("Bhaigiri", "Pattya", 3));
        booklist.add(new Book("RunningLate", "Vijaya", 1));
    }
    public void displaylibrary(){
    for(Book b:booklist){
        System.out.println(b);
        }
    }

    public void addStudents() {
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 3));
        students.add(new Student("Diana", 4));
        students.add(new Student("Eve", 5));
    }

    private Student findStudentById(int id) {
        for (Student s : students) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }

    public void bookissue(String bookname, int studentId) throws StudentNotFoundException {
        Student s = findStudentById(studentId);
        if (s == null) {
            throw new StudentNotFoundException("Student not found: " + studentId);
        }

        try {
            for (Book b : booklist) {
                if (b.name.equals(bookname)) {
                    if (b.isAvailable()) {
                        b.issuedCopies++;
                        s.issuedBooks.add(b);
                        System.out.println("Book issued to " + s.name + ": " + bookname);
                    } else {
                        throw new OutOfStockException("No copies available for: " + bookname);
                    }
                    return;
                }
            }
            throw new OutOfStockException("Book not found: " + bookname);
        } catch (OutOfStockException e) {
            System.out.println("Issue failed: " + e.getMessage());
        }
    }

    public void returnbook(String bookname, int studentId) throws StudentNotFoundException {
        Student s = findStudentById(studentId);
        if (s == null) {
            throw new StudentNotFoundException("Student not found: " + studentId);
        }

        try {
            Book foundBook = null;
            for (Book b : booklist) {
                if (b.name.equals(bookname)) {
                    foundBook = b;
                    break;
                }
            }

            if (foundBook == null) {
                throw new OutOfStockException("Book not found: " + bookname);
            }

            if (foundBook.issuedCopies > 0 && s.issuedBooks.contains(foundBook)) {
                foundBook.issuedCopies--;
                s.issuedBooks.remove(foundBook);
                System.out.println("Book returned by " + s.name + ": " + bookname);
            } else {
                throw new OutOfStockException("No issued copy to return for: " + bookname);
            }
        } catch (OutOfStockException e) {
            System.out.println("Return failed: " + e.getMessage());
        }
    }

    public void displayStudentIssuedBooks(int studentId1) throws StudentNotFoundException {
        Student s = findStudentById(studentId1);
        if (s == null) {
            throw new StudentNotFoundException("Student not found: " + studentId1);
        }

        if (s.issuedBooks.isEmpty()) {
            System.out.println(s.name + " has no books issued.");
        } else {
            System.out.println(s.name + "'s issued books:");
            for (Book b : s.issuedBooks) {
                System.out.println("  - " + b.name + " by " + b.author);
            }
        }
    }
}
