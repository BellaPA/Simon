
public class Rekursiv {

	
	public static int factorial(int value) {
		//int value1;
		
		if(value < 0) {
			return -1;
		}
		else if(value == 0) {
			return 1;
		}
		else if(value > 0) {
			return value = value * factorial(value-1);
		}
		return value;
		
	}
	public int sumFactorial(int value) {
		
		int ausgabe=0;
		if(value < 0) {
			System.out.println("-1");
		}
		else {
			for(int i = value; i > 0; i--) {
			 ausgabe = ausgabe + factorial(i);
			System.out.println("Factrorial von der Zahl "+i + " ist: "+ ausgabe);
		}}
		return ausgabe;
		
	}
	
	public static void main(String[] args) {
		
		factorial(3);
		System.out.println("Factrorial von der Zahl 3 ist " + factorial(3));
		
		Rekursiv rek = new Rekursiv();
		rek.sumFactorial(3);
		System.out.println("Letztes " + rek.sumFactorial(4));
	}
}
