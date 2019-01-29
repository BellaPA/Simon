
public class Bicycle extends Bike {

	public Bicycle(RentalDuration rental, BikeType bike, int berechnung) {
		super(rental, bike, berechnung);
	}
	
	
	public String toString() {
		return "Typ: " + bike + " Verleihdauer: " + rental + "Preis: " + berechnung;
	}
	
}
