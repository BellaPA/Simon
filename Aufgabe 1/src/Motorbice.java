
public class Motorbice extends Bike {
	
	protected int tankstand;
	
	public Motorbice(RentalDuration rental, BikeType bike, int tankstand, int berechnung) {
		super(rental, bike, berechnung);
		this.tankstand = tankstand;
	}
	
	@Override
	public String toString() {
		System.out.println( "Typ: " + bike + ", " + "Verleihdauer: " +  rental + ", " + "Preis: " + calcRent());
		return "Typ: " + bike + " Verleihdauer: " + rental + "Preis: " + calcRent();
	}
	
	@Override
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
		System.out.println(preis);
		System.out.println(preis + tankstand + 4);
		return (preis + tankstand + 4);
	}
	
	

}
