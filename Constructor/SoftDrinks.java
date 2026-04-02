class SoftDrinks{
	
	String name;
	String brand;
	double price;
	double volume;
	String flavor;
	boolean isCarbonated;
	String packagingType;
	double sugarContent;
	String color;
	String originCountry;
	
	SoftDrinks(String name,String brand,double price,double volume,
	          String flavor,boolean isCarbonated,String packagingType,
	          double sugarContent,String color,String originCountry){
		
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.volume = volume;
		this.flavor = flavor;
		this.isCarbonated = isCarbonated;
		this.packagingType = packagingType;
		this.sugarContent = sugarContent;
		this.color = color;
		this.originCountry = originCountry;
		
		System.out.println("=======Executing the Constructor=====");
	}
	
	void show(){
		
		System.out.println("---------Accessing instance var in method--------");
		
		System.out.println("Name : " + name);
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Volume (ml) : " + volume);
		System.out.println("Flavor : " + flavor);
		System.out.println("Carbonated : " + isCarbonated);
		System.out.println("Packaging : " + packagingType);
		System.out.println("Sugar Content (g) : " + sugarContent);
		System.out.println("Color : " + color);
		System.out.println("Origin Country : " + originCountry);
	}
}