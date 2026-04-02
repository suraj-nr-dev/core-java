class Umbrella{

	String brand;
	double price;
	String color;
	double size;
	String material;
	boolean isFoldable;
	String handleType;
	String type;
	double weight;
	String genderType;
	
	Umbrella(String brand,double price,String color,double size,
	         String material,boolean isFoldable,String handleType,
	         String type,double weight,String genderType){
		
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.material = material;
		this.isFoldable = isFoldable;
		this.handleType = handleType;
		this.type = type;
		this.weight = weight;
		this.genderType = genderType;
		
		System.out.println("=======Executing the Constructor=====");
	}
	
	void show(){
		
		System.out.println("---------Accessing instance var in method--------");
		
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Color : " + color);
		System.out.println("Size : " + size);
		System.out.println("Material : " + material);
		System.out.println("Foldable : " + isFoldable);
		System.out.println("Handle Type : " + handleType);
		System.out.println("Type : " + type);
		System.out.println("Weight : " + weight);
		System.out.println("Gender Type : " + genderType);
	}
}