package misc;

public abstract class FastFood implements NutritionFact {
	
	String foodName;

	public void calculateCalorie() {
		System.out.println("Calorie value");
	}

	protected  void setName( String foodName ){
		this.foodName = foodName;
	}
	
	protected String getName(){
		return this.foodName;
	}
}

final class TreatTon {
	
}

abstract class TransTon2 {

	public void transTon2Test() {
	
		System.out.println("transTon2Test");
	}
	
	
}