public class Library {
  
    private String bookName;
    private boolean available = true;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public boolean getAvailability() {
        return available;
    }

    public void issueBook() {

        if (available) {
            available = false;
            System.out.println("Book Issued Successfully.");
        } else {
            System.out.println("Book is Not Available.");
        }
    }

    public void returnBook() {

        if (!available) {
            available = true;
            System.out.println("Book Returned Successfully.");
        } else {
            System.out.println("Book is Already Available.");
        }
    }

    public void displayDetails() {

        System.out.println("\n------ Library Details ------");
        System.out.println("Book Name        : " + bookName);
        System.out.println("Book Available   : " + available);
    }
}
