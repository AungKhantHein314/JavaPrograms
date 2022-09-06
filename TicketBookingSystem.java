import java.math.BigDecimal;
import java.util.Scanner;

class Constant {
}

public class TicketBookingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new TicketBookingSystem(sc);
	}

	public TicketBookingSystem(Scanner sc) {
		getTicketGeneralInformation(sc);
	}

	private void getTicketGeneralInformation(Scanner sc) {
		// String kindOfTicket = sc.nextLine(); // default
		// String tickerFor = sc.nextLine(); // default
		TransportingTicket ticket1 = new TransportingTicket("Aung Khant Hein", 18, 1, "1000", "1a", "2000", "1am",
				"2am", "hello", "200", "hello", "hello");
		System.out.println(ticket1);
	}
}

class Ticket {
	String name;
	int age;
	int ticketCount;
	String pricePerTicket;
	public static Ticket[] tickets = new Ticket[0];

	public Ticket(String name, int age, int ticketCount, String pricePerTicket) {
		this.name = name;
		this.age = age;
		this.ticketCount = ticketCount;
		this.pricePerTicket = pricePerTicket;
	}

	public BigDecimal totalCharge() {
		BigDecimal totalCharge = new BigDecimal(pricePerTicket).multiply(new BigDecimal(ticketCount))
				.add(new BigDecimal(age));
		return totalCharge;
	}

	public String toString() {
		String information = "____________________________________________________________\n\n" + "Ticket of "
				+ String.valueOf(name) + "...\n" + "____________________________________________________________\n\n"
				+ String.format("%-30s%s\n", " Ticket Count: ", ticketCount)
				+ String.format("%-30s%s\n", " Price Per Ticket: ", pricePerTicket);
		return information;
	}
}

// *** Transporting ***
class TransportingTicket extends Ticket {
	String seatNumber;
	String serviceCharge;
	String takeOffTime;
	String arriveTime;
	String transportingCompany;
	String discount;
	String takeOffLocation;
	String arriveLocation;

	public TransportingTicket(String name, int age, int ticketCount, String pricePerTicket, String seatNumber,
			String serviceCharge, String takeOffTime, String arriveTime, String transportingCompany, String discount,
			String takeOffLocation, String arriveLocation) {
		super(name, age, ticketCount, pricePerTicket);
		this.seatNumber = seatNumber;
		this.serviceCharge = serviceCharge;
		this.takeOffTime = takeOffTime;
		this.arriveTime = arriveTime;
		this.transportingCompany = transportingCompany;
		this.discount = discount;
		this.takeOffLocation = takeOffLocation;
		this.arriveLocation = arriveLocation;
	}

	protected String calculateDistance() {
		String distance = "1000km"; // Calculation process here
		return distance;
	}

	public BigDecimal totalCharge() {
		BigDecimal totalCharge = super.totalCharge()
				.add(new BigDecimal(serviceCharge).subtract(new BigDecimal(discount)));
		return totalCharge;
	}

	public String toString() {
		String information = String.format("%-30s%s\n", " Seat Number: ", seatNumber)
				+ String.format("%-30s%s\n", " Service Charge: ", serviceCharge)
				+ String.format("%-30s%s\n", " Take Off Time: ", takeOffTime)
				+ String.format("%-30s%s\n", " Arrive Time: ", arriveTime)
				+ String.format("%-30s%s\n", " Transporting Company: ", transportingCompany)
				+ String.format("%-30s%s\n", " Discount: ", discount)
				+ String.format("%-30s%s\n", " Take Off Location: ", takeOffLocation)
				+ String.format("%-30s%s\n", " Arrive Location: ", arriveLocation);
		return super.toString() + information;
	}
}

// Airplane Ticket
class AirplaneTicket extends TransportingTicket {
	String kindOfClass;
	private String passportNo;
	String airport;
	String flightNumber;
	private String visaNumber;

	public AirplaneTicket(String name, int age, int ticketCount, String pricePerTicket, String seatNumber,
			String serviceCharge, String takeOffTime, String arriveTime, String transportingCompany, String discount,
			String takeOffLocation, String arriveLocation, String kindOfClass, String passportNo, String airport,
			String flightNumber, String visaNumber) {
		super(name, age, ticketCount, pricePerTicket, seatNumber, serviceCharge, takeOffTime, arriveTime,
				transportingCompany, discount, takeOffLocation, arriveLocation);
		this.kindOfClass = kindOfClass;
		this.passportNo = passportNo;
		this.airport = airport;
		this.flightNumber = flightNumber;
		this.visaNumber = visaNumber;
	}

	double calculateTotalPrice() {
		return 1234;
	}

	private String getPassportNo() {
		return passportNo;
	}
	
	private String getVisaNumber() {
		return visaNumber;
	}

	public String toString() {
		String information = String.format("%-30s%s\n", " Seat Number: ", kindOfClass)
				+ String.format("%-30s%s\n", " Take Off Time: ", airport)
				+ String.format("%-30s%s\n", " Arrive Time: ", flightNumber)
				+ String.format("\n%-30s%s\n", " TotalCharge: ", totalCharge());
		return super.toString() + information;
	}
}

// BusTicket
class BusTicket extends TransportingTicket {
	String seatClass;

	public BusTicket(String name, int age, int ticketCount, String pricePerTicket, String seatNumber,
			String serviceCharge, String takeOffTime, String arriveTime, String transportingCompany, String discount,
			String takeOffLocation, String arriveLocation, String seatClass) {
		super(name, age, ticketCount, pricePerTicket, seatNumber, serviceCharge, takeOffTime, arriveTime,
				transportingCompany, discount, takeOffLocation, arriveLocation);
		this.seatClass = seatClass;
	}

	double calculateTotalPrice() {
		return 1234;
	}

	public String toString() {
		String information = String.format("%-30s%s\n", " Seat Class: ", seatClass)
				+ String.format("\n%-30s%s\n", " TotalCharge: ", totalCharge());
		return super.toString() + information;
	}
}

// *** Entertainment ***
class EntertainmentTicket extends Ticket {
	String eventLocation;
	String eventStartingTime;
	String eventEndTime;
	String snackAndDrinkCharge;

	public EntertainmentTicket(String name, int age, int ticketCount, String pricePerTicket, String eventLocation,
			String eventStartingTime, String eventEndTime, String snackAndDrinkCharge) {
		super(name, age, ticketCount, pricePerTicket);
		this.eventLocation = eventLocation;
		this.eventStartingTime = eventStartingTime;
		this.eventEndTime = eventEndTime;
		this.snackAndDrinkCharge = snackAndDrinkCharge;
	}

	public BigDecimal totalCharge() {
		BigDecimal totalCharge = super.totalCharge().add(new BigDecimal(snackAndDrinkCharge));
		return totalCharge;
	}

	public String toString() {
		String information = String.format("%-30s%s\n", " Event Location: ", eventLocation)
				+ String.format("%-30s%s\n", " Event Starting Time: ", eventStartingTime)
				+ String.format("%-30s%s\n", " Event End Time: ", eventEndTime)
				+ String.format("%-30s%s\n", " Snack And Drink Charge: ", snackAndDrinkCharge);
		return super.toString() + information;
	}
}

// Cinema Ticket
class CinemaTicket extends EntertainmentTicket {
	String kindOfSeat;
	String cinema;
	String movieName;

	public CinemaTicket(String name, int age, int ticketCount, String pricePerTicket, String eventLocation,
			String eventStartingTime, String eventEndTime, String snackAndDrinkCharge, String kindOfSeat, String cinema,
			String movieName) {
		super(name, age, ticketCount, pricePerTicket, eventLocation, eventStartingTime, eventEndTime,
				snackAndDrinkCharge);
		this.kindOfSeat = kindOfSeat;
		this.cinema = cinema;
		this.movieName = movieName;
	}

	double calculateTotalPrice() {
		return 1234;
	}

	public String toString() {
		String information = String.format("%-30s%s\n", " Kind of Seat: ", kindOfSeat)
				+ String.format("%-30s%s\n", " Cinema: ", cinema)
				+ String.format("%-30s%s\n", " Movie Name: ", movieName)
				+ String.format("\n%-30s%s\n", " TotalCharge: ", totalCharge());
		return super.toString() + information;
	}
}

// EDM Ticket
class EDMTicket extends EntertainmentTicket {
	String mainDJ;

	public EDMTicket(String name, int age, int ticketCount, String pricePerTicket, String eventLocation,
			String eventStartingTime, String eventEndTime, String snackAndDrinkCharge, String mainDJ) {
		super(name, age, ticketCount, pricePerTicket, eventLocation, eventStartingTime, eventEndTime,
				snackAndDrinkCharge);
		this.mainDJ = mainDJ;
	}

	double calculateTotalPrice() {
		return 1234;
	}

	public String toString() {
		String information = String.format("%-30s%s\n", " Main DJ: ", mainDJ)
				+ String.format("\n%-30s%s\n", " TotalCharge: ", totalCharge());
		return super.toString() + information;
	}
}
