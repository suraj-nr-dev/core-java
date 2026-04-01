class FishTank {
	
	String shape;
	int capacity;
	float waterLevel;
	String glassType;
	float weight;
	boolean hasFilter;
	String brand;
	String country;
	int price;
	int warrantyYears;

	FishTank(String shape,int capacity,float waterLevel,String glassType,float weight,boolean hasFilter,
	String brand,String country,int price,int warrantyYears){
		
		this.shape = shape;
		this.capacity = capacity;
		this.waterLevel = waterLevel;
		this.glassType = glassType;
		this.weight = weight;
		this.hasFilter = hasFilter;
		this.brand = brand;
		this.country = country;
		this.price = price;
		this.warrantyYears = warrantyYears;

		System.out.println("Updating the this keyword ....");
	}
}