package LibraryManagement;

import java.util.Scanner;

public class TestLibrary {
    public static void main(String[] args) {
        Library library  =new Library();
        library.addStudents();

        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Library Menu");
            System.out.println("1.AddBook \n 2.DisplayLibrary \n 3.IssueBook \n 4.ReturnBook \n 5.DisplayBookissued \n 6.Exit");
            System.out.println("Enter Your Choice");
            choice= sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    library.addbook();
                    break;

                case 2:
                    library.displaylibrary();
                    break;

                case 3:
                    try {
                        System.out.println("Enter the book Name: ");
                        String bookname= sc.nextLine();
                        System.out.println("Enter the Student ID : ");
                        int studentId= sc.nextInt();
                        sc.nextLine();

                        library.bookissue(bookname,studentId);

                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Enter the book Name: ");
                        String bookname = sc.nextLine();
                        System.out.println("Enter the Student ID : ");
                        int studentId = sc.nextInt();
                        sc.nextLine();

                        library.returnbook(bookname, studentId);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        System.out.println("Enter the Student ID : ");
                        int studentId1 = sc.nextInt();
                        sc.nextLine();

                        library.displayStudentIssuedBooks(studentId1);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                        System.out.println("ThankYou for Visiting!");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }while(choice!=6);
    sc.close();
    }
}
