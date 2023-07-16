abstract class LibraryItem {
    private String title;
    private String itemID;
    private boolean checkedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void checkIn() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println(title + " has been checked in.");
        } else {
            System.out.println(title + " is already checked in.");
        }
    }

    public abstract void displayItemDetails();
    
    // Getters
    public String getTitle() {
        return title;
    }

    public String getItemID() {
        return itemID;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}

class Book extends LibraryItem {
    private String author;
    private int numPages;

    public Book(String title, String itemID, String author, int numPages) {
        super(title, itemID);
        this.author = author;
        this.numPages = numPages;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Item ID: " + getItemID());
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages);
    }
    
    // Getters
    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    // Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}

class Magazine extends LibraryItem {
    private String issueDate;
    private String publisher;

    public Magazine(String title, String itemID, String issueDate, String publisher) {
        super(title, itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Item ID: " + getItemID());
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Publisher: " + publisher);
    }
    
    // Getters
    public String getIssueDate() {
        return issueDate;
    }

    public String getPublisher() {
        return publisher;
    }

    // Setters
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

class LibraryMember {
    private String memberID;
    private String name;

    public LibraryMember(String memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }

    public void displayMemberDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
    }
    
    // Getters
    public String getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240);
        Book book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        Book book3 = new Book("1984", "B003", "George Orwell", 328);
        Book book4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
        Book book5 = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320);

        // Create Magazine objects
        Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
        Magazine magazine2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
        Magazine magazine3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
        Magazine magazine4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
        Magazine magazine5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");

        // Create LibraryMember objects
        LibraryMember member1 = new LibraryMember("L001", "John Doe");
        LibraryMember member2 = new LibraryMember("L002", "Jane Smith");
        LibraryMember member3 = new LibraryMember("L003", "David Johnson");
        LibraryMember member4 = new LibraryMember("L004", "Sarah Williams");
        LibraryMember member5 = new LibraryMember("L005", "Michael Brown");

        // Set properties of objects using setter methods
        book1.setTitle("New Title");
        book1.setAuthor("New Author");
        book2.setNumPages(300);
        magazine1.setIssueDate("September 2023");
        magazine1.setPublisher("Updated Publisher");
        member1.setName("John Smith");

        // Check out and check in a library item
        book1.checkOut();
        book1.checkIn();

        // Display details of library items and members
        LibraryItem[] libraryItems = {book1, book2, book3, book4, book5, magazine1, magazine2, magazine3, magazine4, magazine5};
        for (LibraryItem item : libraryItems) {
            item.displayItemDetails();
            System.out.println();
        }

        LibraryMember[] libraryMembers = {member1, member2, member3, member4, member5};
        for (LibraryMember member : libraryMembers) {
            member.displayMemberDetails();
            System.out.println();
        }
    }
}