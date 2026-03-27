package LibraryManagement;

public class Book {
    public String name;
    public String author;
    public int bookcount;
    public int issuedCopies;
    
    Book(String name,String author,int bookcount){
        this.name=name;
        this.author=author;
        this.bookcount=bookcount;
        this.issuedCopies=0;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return bookcount;
    }

    public void setCount(int bookcount) {
        this.bookcount = bookcount;
    }

    public boolean isAvailable() {
        return issuedCopies < bookcount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookcount=" + bookcount +
                '}';
    }
}
