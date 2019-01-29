
public class Customer {
	
	String name;
	BikeType bike;
	
	public void setCustomer(String name, BikeType bike) {
		this.name = name;
		this.bike = bike;
	}
	
	public String getName() {
		return name;
	}
	
	public BikeType getBike() {
		return bike;
	}
	
	public Customer(String name, BikeType bike) {
		this.name = name;
		this.bike = bike;
	}
	
	public BikeType getFavorite() {
		switch(bike) {
			case BICYCLE: 
				bike = bike.BICYCLE;
				break;
			case MOTORBIKE:
				bike = bike.MOTORBIKE;
				break;
			default:
				
		}
		System.out.println(bike);
		return bike;
	}
	
	

}
