
public class Bike {
	
	protected RentalDuration rental;
	protected BikeType bike;
	protected int berechnung;
	
	
	public String toString() {
		System.out.println( "Typ: " + bike + ", " + " Verleihdauer: " +  rental + ", " + " Preis: " + calcRent());
		return "Typ: " + bike + " Verleihdauer: " + rental + "Preis: " + calcRent();
	}
	
	public int calcRent() {
		int preis = 0;
		switch(rental) {
		case SHORT: 
			preis = preis + 20;
			break;
		case NORMAL:
			preis = preis + 30;
			break;
		case EXTENDED:
			preis = preis + 40;
		default:
			throw new IllegalArgumentException ("Unknown Duration" + rental);
		}
		//System.out.println(preis);
		return preis;
		
	}
	
	public Bike(RentalDuration rental, BikeType bike, int berechnung) {
		this.bike = bike;
		this.rental = rental;
		this.berechnung = berechnung;
	}
	
	
	public void setRental(RentalDuration rental) {
		this.rental = rental;
	}
	
	public void setBike(BikeType bike) {
		System.out.println(bike);
		this.bike = bike;
	}
	
	public RentalDuration getRental() {
		return rental;
	}
	
	public BikeType getBike() {
		return bike;
	}

}
