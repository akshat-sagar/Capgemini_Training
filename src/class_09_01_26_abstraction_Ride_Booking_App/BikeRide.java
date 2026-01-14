package class_09_01_26_abstraction_Ride_Booking_App;

public class BikeRide extends Ride {

	public  void calculateFare(int distance) {
		int fixed = 9;
		return distance * fixed;;
	}
}
