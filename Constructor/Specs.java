class Specs{
	
	double price;
	String brand;
	String frameType;
	String lensType;
	String color;
	double size;
	boolean isPowerLens;
	String material;
	String shape;
	String genderType;
	
	Specs(double price,String brand,String frameType,String lensType,String color,
	      double size,boolean isPowerLens,String material,String shape,String genderType){
		
		this.price = price;
		this.brand = brand;
		this.frameType = frameType;
		this.lensType = lensType;
		this.color = color;
		this.size = size;
		this.isPowerLens = isPowerLens;
		this.material = material;
		this.shape = shape;
		this.genderType = genderType;
		
		System.out.println("=======Executing the Constructor=====");
	}
	
	void show(){
		
		System.out.println("---------Accessing instance var in method--------");
		
		System.out.println("Price : " + price);
		System.out.println("Brand : " + brand);
		System.out.println("Frame Type : " + frameType);
		System.out.println("Lens Type : " + lensType);
		System.out.println("Color : " + color);
		System.out.println("Size : " + size);
		System.out.println("Power Lens : " + isPowerLens);
		System.out.println("Material : " + material);
		System.out.println("Shape : " + shape);
		System.out.println("Gender Type : " + genderType);
	}
}