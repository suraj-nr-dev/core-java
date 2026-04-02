class Boomer{
	String material;
	double length;
	double weight;
	String shape;
	String color;
	boolean isReturningType;
	String brand;
	String originCountry;
	double price;
	String skillLevel;
	
	Boomer(String material,double length,double weight,String shape,
	       String color,boolean isReturningType,String brand,
	       String originCountry,double price,String skillLevel){
		
		this.material = material;
		this.length = length;
		this.weight = weight;
		this.shape = shape;
		this.color = color;
		this.isReturningType = isReturningType;
		this.brand = brand;
		this.originCountry = originCountry;
		this.price = price;
		this.skillLevel = skillLevel;
		
		System.out.println("=======Executing the Constructor=====");
	}
	
	void show(){
		
		System.out.println("---------Accessing instance var in method--------");
		
		System.out.println("Material : " + material);
		System.out.println("Length : " + length);
		System.out.println("Weight : " + weight);
		System.out.println("Shape : " + shape);
		System.out.println("Color : " + color);
		System.out.println("Returning Type : " + isReturningType);
		System.out.println("Brand : " + brand);
		System.out.println("Origin Country : " + originCountry);
		System.out.println("Price : " + price);
		System.out.println("Skill Level : " + skillLevel);
	}
}