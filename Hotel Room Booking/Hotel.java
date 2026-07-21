public class Hotel {

    private int roomNumber;
    private String customerName;
    private boolean bookingStatus;

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public boolean getBookingStatus() {
        return bookingStatus;
    }

    public void bookRoom() {

        if (!bookingStatus) {
            bookingStatus = true;
            System.out.println("Room Booked Successfully.");
        } else {
            System.out.println("Room is Already Booked.");
        }
    }

    public void cancelRoom() {

        if (bookingStatus) {
            bookingStatus = false;
            System.out.println("Booking Cancelled Successfully.");
        } else {
            System.out.println("Room is Already Available.");
        }
    }

    public void displayDetails() {

        System.out.println("\n--------- Hotel Room Details ---------");
        System.out.println("Room Number    : " + roomNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Booking Status : " + bookingStatus);
    }
}
