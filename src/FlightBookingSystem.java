import java.time.*;
import java.time.temporal.ChronoUnit;

public class FlightBookingSystem {

    public static void main(String[] args) {
        // TODO 1: Flight Booking Date (LocalDate)
        LocalDate bookingDate = LocalDate.now();
        LocalDate flightDate = LocalDate.of(2024, 12, 15);
        long daysUntilFlight = ChronoUnit.DAYS.between(bookingDate, flightDate);
        System.out.println(bookingDate);
        System.out.println(flightDate);
        System.out.println("Days Until the Flight: " + daysUntilFlight);
        System.out.println();

        // TODO 2: Flight Time (LocalTime)
        LocalTime departureTime = LocalTime.of(14, 30);
        LocalTime arrivalTime = departureTime.plusHours(5).plusMinutes(45);
        Duration flightDuration = Duration.between(departureTime, arrivalTime);
        System.out.println("Arriving at: " + arrivalTime);
        System.out.println("Flight lasted: " + flightDuration);
        System.out.println();

        // TODO 3: Full Flight Schedule (LocalDateTime)
        LocalDateTime departureDateTime = LocalDateTime.of(flightDate, departureTime);
        LocalDateTime arrivalDateTime = departureDateTime.plus(flightDuration);
        System.out.println("Departure at: " + departureDateTime);
        System.out.println("Arriving at: " + arrivalDateTime);
        System.out.println();


    }
}