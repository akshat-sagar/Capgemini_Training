package class_09_01_26_abstraction_Ride_Booking_App;

public abstract class Ride {

	public void rideDetails() {
		System.out.println("Ride details are -> ");
	}
	public abstract void calculateFare(int distance);
	
}
