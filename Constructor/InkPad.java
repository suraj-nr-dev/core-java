class InkPad{

	String brand;
	String color;
	double price;
	String inkType;
	String size;
	boolean isRefillable;
	String shape;
	String material;
	double inkQuantity;
	String usageType;
	
	InkPad(String brand,String color,double price,String inkType,
	       String size,boolean isRefillable,String shape,
	       String material,double inkQuantity,String usageType){
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.inkType = inkType;
		this.size = size;
		this.isRefillable = isRefillable;
		this.shape = shape;
		this.material = material;
		this.inkQuantity = inkQuantity;
		this.usageType = usageType;
		
		System.out.println("=======Executing the Constructor=====");
	}
	
	void show(){
		
		System.out.println("---------Accessing instance var in method--------");
		
		System.out.println("Brand : " + brand);
		System.out.println("Color : " + color);
		System.out.println("Price : " + price);
		System.out.println("Ink Type : " + inkType);
		System.out.println("Size : " + size);
		System.out.println("Refillable : " + isRefillable);
		System.out.println("Shape : " + shape);
		System.out.println("Material : " + material);
		System.out.println("Ink Quantity : " + inkQuantity);
		System.out.println("Usage Type : " + usageType);
	}
}