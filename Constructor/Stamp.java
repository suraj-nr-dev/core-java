class Stamp{

	String text;
	String brand;
	double price;
	String inkColor;
	String shape;
	String size;
	String material;
	boolean isSelfInking;
	String usageType;
	String country;
	
	Stamp(String text,String brand,double price,String inkColor,
	      String shape,String size,String material,
	      boolean isSelfInking,String usageType,String country){
		
		this.text = text;
		this.brand = brand;
		this.price = price;
		this.inkColor = inkColor;
		this.shape = shape;
		this.size = size;
		this.material = material;
		this.isSelfInking = isSelfInking;
		this.usageType = usageType;
		this.country = country;
		
		System.out.println("=======Executing the Constructor=====");
	}
	
	void show(){
		
		System.out.println("---------Accessing instance var in method--------");
		
		System.out.println("Text : " + text);
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Ink Color : " + inkColor);
		System.out.println("Shape : " + shape);
		System.out.println("Size : " + size);
		System.out.println("Material : " + material);
		System.out.println("Self Inking : " + isSelfInking);
		System.out.println("Usage Type : " + usageType);
		System.out.println("Country : " + country);
	}
}