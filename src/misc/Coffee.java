package misc;

enum CoffeeSize {
	
	BIG( 8, 1 ), HUGE( 10, 1.3 ), OVERWHELING( 16, 1.5 );
	
	private int ounces;
	private double price;

	CoffeeSize( int ounces, double price ) {
		this.ounces = ounces;
		this.price = price;
	}
	
	public int getOunces() {
		return this.ounces;
	}
	
	public double getPrice() {
		return this.price;
	}
}

public class Coffee {
	
	CoffeeSize size;

	public static void main ( String[] args ) {

		Coffee drink1 = new Coffee();
		drink1.size = CoffeeSize.BIG;
		
		Coffee[] drinkArray = new Coffee[3];

		for( int i = 0; i < drinkArray.length; i++ ) {
			drinkArray[i] =new Coffee();
		}
		
		drinkArray[0].size = CoffeeSize.BIG;
		drinkArray[1].size = CoffeeSize.HUGE;
		drinkArray[2].size = CoffeeSize.OVERWHELING;

		System.out.println(drink1.size.getOunces() + "  " + drink1.size.getPrice());
		
		for( int i = 0; i < drinkArray.length; i++ ) {
			
			System.out.println( drinkArray[i].size.name() + "\t\t" + drinkArray[i].size.getOunces()+ "\t\t" + drinkArray[i].size.getPrice());
//			System.out.println(CoffeeSize.class);
		}
	}
}