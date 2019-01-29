
public class BikeRental {
	
	Customer customer;
	
	public BikeRental(Customer customer) {
		this.customer = customer;
	}

	public BikeType rentBike(Customer customer, RentalDuration rental) {
		return customer.getFavorite();
	}
	
	
	public int returnBike (Bike bike) {
		bike.calcRent();
		for ( int i= 0; i < 50; i++  ) {
			if(bike.equals(BikeType.MOTORBIKE)) {
				if(i > 100 ) {
					System.out.print((Integer) null); 
				} else {
					continue;
				}
				System.out.println("I ist: "+ i);
			}
			if(bike.equals(BikeType.BICYCLE)) {
				if(i > 50 ) {
					System.out.print((Integer) null); 
				} else {
					continue;
				}
				
				System.out.println("I ist: "+ i);
			}
			bike.calcRent();	
		}
		System.out.println("Bike Rent is: " + bike.calcRent());
		return bike.calcRent();	
	}

	public Customer getCustomer() {
		return customer;
		
		
	}

}
