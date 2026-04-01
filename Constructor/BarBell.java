class BarBell {
	
	String material;
	int length;
	float diameter;
	String gripType;
	float weight;
	boolean hasPlates;
	String brand;
	String country;
	int price;
	int maxLoad;

	BarBell(String material,int length,float diameter,String gripType,float weight,boolean hasPlates,
	String brand,String country,int price,int maxLoad){
		
		this.material = material;
		this.length = length;
		this.diameter = diameter;
		this.gripType = gripType;
		this.weight = weight;
		this.hasPlates = hasPlates;
		this.brand = brand;
		this.country = country;
		this.price = price;
		this.maxLoad = maxLoad;

		System.out.println("Updating the this keyword ....");
	}
}