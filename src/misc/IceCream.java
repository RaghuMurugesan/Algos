package misc;

public class IceCream extends FastFood {

	@Override
	public void setName( String foodName) {
	//	super.setName(foodName);
		System.out.println("Name copied........ "+ foodName);
		this.foodName = foodName;
	}
	
	@Override
	public String getName() {
		return foodName;
	}
	

	public static void main(String[] args) {
		FastFood strawBerry = new IceCream();
		strawBerry.setName("STRAWBERRY");
		System.out.println("Retrived item name  "+strawBerry.getName());
		strawBerry.calculateCalorie();
	}
}
