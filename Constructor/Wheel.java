class Wheel {
	
	String type;
	int radius;
	float thickness;
	String material;
	float weight;
	boolean isTubeless;
	String brand;
	String vehicleType;
	int price;
	int durability;

	Wheel(String type,int radius,float thickness,String material,float weight,boolean isTubeless,
	String brand,String vehicleType,int price,int durability){
		
		this.type = type;
		this.radius = radius;
		this.thickness = thickness;
		this.material = material;
		this.weight = weight;
		this.isTubeless = isTubeless;
		this.brand = brand;
		this.vehicleType = vehicleType;
		this.price = price;
		this.durability = durability;

		System.out.println("Updating the this keyword ....");
	}
}