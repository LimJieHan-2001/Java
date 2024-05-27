// TestSportFacility.java
// TRIAL TEST 2 - Question 2
// SECJ2154 - 2023/2024-2
// Name: Lim Jie Han
// Matric No.: A21EC3013
class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;

    public Address(String street, String city, String state, String postalCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + postalCode;
    }
}

// Person class
class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address;
    }
}

// SportClubFacility class
class SportClubFacility {
    private String facilityName;
    private String facilityType;

    public SportClubFacility(String facilityName, String facilityType) {
        this.facilityName = facilityName;
        this.facilityType = facilityType;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public String getFacilityType() {
        return facilityType;
    }

    @Override
    public String toString() {
        return "Facility Name: " + facilityName + ", Facility Type: " + facilityType;
    }
}

// Booking class
class Booking {
    private Person person;
    private SportClubFacility facility;
    private String bookingDate;

    public Booking(Person person, SportClubFacility facility, String bookingDate) {
        this.person = person;
        this.facility = facility;
        this.bookingDate = bookingDate;
    }

    public Person getPerson() {
        return person;
    }

    public SportClubFacility getFacility() {
        return facility;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    @Override
    public String toString() {
        return "Booking: " + person.getName() + " booked " + facility.getFacilityName() + " on " + bookingDate;
    }
}

// TestSportFacility class
public class TestSportFacility {
    public static void main(String[] args) {
        System.out.println("\n\nLab Test - SportClub Facility Booking System\n");

        // checkpoint #1 - Create 2 sportclub facilities
        SportClubFacility facility1 = new SportClubFacility("Gymnasium", "Indoor");
        SportClubFacility facility2 = new SportClubFacility("Swimming Pool", "Outdoor");

        // Display 2 sportclub facilities
        System.out.println("Checkpoint #1");
        System.out.println(facility1);
        System.out.println(facility2);

        // checkpoint #2 - Create 1 Person member1
        Address address1 = new Address("123 Main St", "CityA", "StateA", "12345");
        Person member1 = new Person("Alice Smith", address1);

        // Display member1 info
        System.out.println("Checkpoint #2");
        System.out.println(member1);

        // checkpoint #3 - Create 1 Person member2
        Address address2 = new Address("456 Elm St", "CityB", "StateB", "67890");
        Person member2 = new Person("Bob Johnson", address2);

        // Create 1 Booking booking1
        Booking booking1 = new Booking(member2, facility1, "2024-06-01");

        // Display member2 info
        System.out.println("Checkpoint #3");
        System.out.println(member2);
        System.out.println(booking1);
    }
}
















