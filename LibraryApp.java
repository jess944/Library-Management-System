
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Library library=new Library();

        library.addBook(new Book(1,"Java Basics" ,"James gosling"));
        library.addBook(new Book(2,"OOPS", "Bjarne"));

        Member member= new Member(101, "Jessy");

        int choice;
        do {
            System.out.println("\n---library Management System---");
            System.out.println("1. Show Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your Choice: ");

            choice= sc.nextInt();

            switch (choice) {
                case 1 :
                    library.showBooks();
                    break;

                case 2 :
                    System.out.print("Enter a Issued Book: ");
                    library.issueBook(sc.nextInt(), member);
                    break;

                case 3 :
                    System.out.print("Enter a Returned Book: ");
                    library.returnBook(sc.nextInt());
                    break;

                case 4 :
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice!= 4);

        sc.close();
    }
}
