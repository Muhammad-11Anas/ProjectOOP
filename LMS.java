package ProjectOOP;
import java.time.LocalDate;
import java.util.*;
public class Book {
    private String isbnCode;
    private String title;
    private String description;
    private String author;
    private String subject;
    private int unitsAvailable;

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getUnitsAvailable() {
        return unitsAvailable;
    }

    public void setUnitsAvailable(int unitsAvailable) {
        this.unitsAvailable = unitsAvailable;
    }
}
//import java.time.LocalDate;

public class Member {
    private int memberId;
    private String memberName;
    private LocalDate dateOfJoining;

    public Member() {
    }

    public Member(int memberId, String memberName, LocalDate dateOfJoining) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.dateOfJoining = dateOfJoining;
    }

    public LocalDate getDateOfJoining() {
        return this.dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
//import java.util.*;

public class AddMemberMenu {

    public static void addMemberMenu() {
        System.out.println("\n\t\t\t\t\t You have reached the add member menu");
        Member m = new Member();
        Scanner s = new Scanner(System.in);
        boolean addStatus = false;

        while (!addStatus) {
            try {
                System.out.print("\n Enter the member id: ");
                m.setMemberId(Integer.parseInt(s.nextLine()));
                System.out.print(" Enter the member name: ");
                m.setMemberName(s.nextLine());
                addMember(m);
                addStatus = true;
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input. Member id must be a number.");
            }
        }
    }

    public static void addMember(Member m) {
        System.out.println("\n You have reached inside add member for member id: " + m.getMemberId());
        System.out.println("\n Added Member successfully:");
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println(" Member ID: " + m.getMemberId());
        System.out.println(" Member Name: " + m.getMemberName());
    }

    public static void main(String[] args) {
        addMemberMenu();
    }
}

public class AddBookMenu {
    public static void addBookMenu() {
        System.out.println("\n\t\t\t\t You have reached the add book menu");
        Book b = new Book();
        Scanner s = new Scanner(System.in);
        boolean addStatus = false;

        while (!addStatus) {
            try {
                System.out.print("\n Enter the isbn code: ");
                b.setIsbnCode(s.nextLine());

                System.out.print(" Enter the book name: ");
                b.setTitle(s.nextLine());

                System.out.print(" Enter the book description: ");
                b.setDescription(s.nextLine());

                System.out.print(" Enter the author name: ");
                b.setAuthor(s.nextLine());

                System.out.print(" Enter the subject: ");
                b.setSubject(s.nextLine());

                System.out.print(" Enter the units available: ");
                b.setUnitsAvailable(Integer.parseInt(s.nextLine()));

                addBook(b);
                addStatus = true;
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input for units available. Please enter a valid number.");
            } catch (Exception e) {
                System.out.println(" An error occurred. Please try again.");
                e.printStackTrace();
            }
        }

        System.out.println("\n Book added successfully!");
    }

    public static void addBook(Book b) {
        System.out.println(" Reached inside addBook for book: " + b.getIsbnCode());
    }

    public static void main(String[] args) {
        addBookMenu();
    }
}
public class LibFunctions {

    public static void callIssueMenu() {
        Scanner s = new Scanner(System.in);
        Member m = new Member();
        Book b = new Book();
        boolean addStatus = false;

        while (!addStatus) {
            try {
                System.out.print("\n Enter the member id: ");
                m.setMemberId(Integer.parseInt(s.nextLine()));
                System.out.print(" Enter the ISBN code: ");
                b.setIsbnCode(s.nextLine());
                issueBook(m, b);
                addStatus = true;
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input. Please enter a valid number.");
            }
        }
    }

    public static void issueBook(Member m, Book b) {
        System.out.println("\t\t\t\t\t Issuing the book...");
        System.out.println("\n Book issued successfully!");
    }

    public static void callReturnMenu() {
        Scanner s = new Scanner(System.in);
        Member m = new Member();
        Book b = new Book();
        boolean addStatus = false;

        while (!addStatus) {
            try {
                System.out.print("\n Enter the member id: ");
                m.setMemberId(Integer.parseInt(s.nextLine()));
                System.out.print(" Enter the ISBN code: ");
                b.setIsbnCode(s.nextLine());
                returnBook(m, b);
                addStatus = true;
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input. Please enter a valid number.");
            }
        }
    }

    public static void returnBook(Member m, Book b) {
        System.out.println("\t\t\t\t\t Returning the book...");
        System.out.println("\n Book returned successfully!");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\t\t\t\t\tLibrary Management System");
            System.out.println("\n 1. Issue a book");
            System.out.println(" 2. Return a book");
            System.out.println(" 3. Exit");
            System.out.print("\n Enter your choice: ");

            try {
                choice = Integer.parseInt(s.nextLine());

                switch (choice) {
                    case 1:
                        callIssueMenu();
                        break;
                    case 2:
                        callReturnMenu();
                        break;
                    case 3:
                        System.out.println("\n\t\t\t\t\t Exiting...");
                        break;
                    default:
                        System.out.println(" Invalid choice. Please enter 1, 2, or 3.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input. Please enter a valid number.");
                choice = 0;
            }
        } while (choice != 3);
    }
}
public class LMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------------------------------");
            System.out.println(" Select one of the following options:");
            System.out.println(" Enter 1 to add a book");
            System.out.println(" Enter 2 to add a member");
            System.out.println(" Enter 3 to issue a book");
            System.out.println(" Enter 4 to return a book");
            System.out.println(" Enter 5 to exit");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("---------------------------------------------------------");
                    System.out.println(" You have selected option 1 to add a book");
                    AddBookMenu.addBookMenu();
                    break;
                case "2":
                    System.out.println("---------------------------------------------------------");
                    System.out.println(" You have selected option 2 to add a member");
                    AddMemberMenu.addMemberMenu();
                    break;
                case "3":
                    System.out.println("---------------------------------------------------------");
                    System.out.println(" You have selected option 3 to issue a book");
                    LibFunctions.callIssueMenu();
                    break;
                case "4":
                    System.out.println("---------------------------------------------------------");
                    System.out.println(" You have selected option 4 to return a book");
                    LibFunctions.callReturnMenu();
                    break;
                case "5":
                    System.out.println("---------------------------------------------------------");
                    System.out.println(" Exiting the program. Thanks for using the library system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("---------------------------------------------------------");
                    System.out.println(" Invalid input. Please enter a number from 1 to 5.");
            }
        }
    }
}