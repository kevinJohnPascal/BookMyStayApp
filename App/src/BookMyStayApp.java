/**
 * UseCase2RoomInitialization demonstrates Object-Oriented Programming (OOP)
 * principles such as Abstraction, Inheritance, and Encapsulation.
 * * @author YourName
 * @version 2.0
 */

// --- 1. Abstract Base Class ---
abstract class Room {
    private String type;
    private double price;

    public Room(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() { return type; }
    public double getPrice() { return price; }

    // Abstract method to be implemented by subclasses
    public abstract void displayFeatures();
}

// --- 2. Concrete Subclasses ---
class SingleRoom extends Room {
    public SingleRoom() { super("Single Room", 100.0); }
    @Override
    public void displayFeatures() {
        System.out.println("Features: 1 Single Bed, Wi-Fi, Desk.");
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() { super("Double Room", 150.0); }
    @Override
    public void displayFeatures() {
        System.out.println("Features: 1 King Bed or 2 Twin Beds, Wi-Fi, Mini-fridge.");
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() { super("Suite", 300.0); }
    @Override
    public void displayFeatures() {
        System.out.println("Features: Living Area, Kitchenette, Ocean View, King Bed.");
    }
}

// --- 3. Main Application Class ---
public class UC2 {
    public static void main(String[] args) {
        System.out.println("Book My Stay App - Version 2.0");
        System.out.println("-------------------------------------------");

        // Initializing Room Objects
        Room single = new SingleRoom();
        Room doubleRm = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static Availability (Represented by simple variables for now)
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Displaying Room Details and Availability
        displayRoomInfo(single, singleAvailable);
        displayRoomInfo(doubleRm, doubleAvailable);
        displayRoomInfo(suite, suiteAvailable);

        System.out.println("-------------------------------------------");
    }

    // Helper method demonstrating Polymorphism (accepts any 'Room' type)
    public static void displayRoomInfo(Room room, int count) {
        System.out.println("Room Type: " + room.getType());
        System.out.println("Price per Night: $" + room.getPrice());
        room.displayFeatures();
        System.out.println("Current Availability: " + count);
        System.out.println();
    }
}