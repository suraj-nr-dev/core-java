class VRBox {
	
	String model;
	int lensSize;
	float viewingAngle;
	String color;
	float weight;
	boolean hasController;
	String brand;
	String country;
	int price;
	int warranty;

	VRBox(String model,int lensSize,float viewingAngle,String color,float weight,boolean hasController,String brand,String country,int price,int warranty){
		
		this.model = model;
		this.lensSize = lensSize;
		this.viewingAngle = viewingAngle;
		this.color = color;
		this.weight = weight;
		this.hasController = hasController;
		this.brand = brand;
		this.country = country;
		this.price = price;
		this.warranty = warranty;

		System.out.println("Updating the this keyword ....");
	}
}