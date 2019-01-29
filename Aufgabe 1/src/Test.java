
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Bike test1 = new Bike(RentalDuration.SHORT, BikeType.BICYCLE, 0 );
		//test1.calcRent();
		//test1.setBike(BikeType.BICYCLE);
		//test1.toString();
		
		/* Motorbice test2 = new Motorbice(RentalDuration.NORMAL, BikeType.MOTORBIKE, 0, 10);
		test2.calcRent();
		test2.toString();
		test2.setBike(BikeType.BICYCLE);
		*/
		
		Customer eins = new Customer("Hubert", BikeType.MOTORBIKE);
		//eins.getFavorite();
		BikeRental test3 = new BikeRental(eins);
		test3.returnBike(test1);
		
		//Problem: durch die Bikes zählen!     bei RentalDuration schleife..........
	}

}
