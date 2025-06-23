import java.util.*;

public class TravelBooking extends Booking {
    List<String> flights = new ArrayList<>();
    List<String> hotels = new ArrayList<>();

    void addFlight(String flight) {
        flights.add(flight);
    }

    void addHotel(String hotel) {
        hotels.add(hotel);
    }

    void searchFlights(String keyword) {
        System.out.println("Searching for flights containing: " + keyword);
        for (String flight : flights) {
            if (flight.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + flight);
            }
        }
    }

    void searchHotels(String keyword) {
        System.out.println("Searching for hotels containing: " + keyword);
        for (String hotel : hotels) {
            if (hotel.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + hotel);
            }
        }
    }
}
