class DumbBells {
	
	String material;
	int weightKg;
	float gripSize;
	String color;
	float pricePerSet;
	boolean isAdjustable;
	String brand;
	String country;
	int maxWeight;
	int warranty;

	DumbBells(String material,int weightKg,float gripSize,String color,float pricePerSet,boolean isAdjustable,String brand,String country,int maxWeight,int warranty){
		
		this.material = material;
		this.weightKg = weightKg;
		this.gripSize = gripSize;
		this.color = color;
		this.pricePerSet = pricePerSet;
		this.isAdjustable = isAdjustable;
		this.brand = brand;
		this.country = country;
		this.maxWeight = maxWeight;
		this.warranty = warranty;

		System.out.println("Updating the this keyword ....");
	}
}