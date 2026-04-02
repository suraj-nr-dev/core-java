class Chain{
	
	double weight;
	double price;
	String material;
	String color;
	double length;
	String design;
	String brand;
	int purity;
	boolean isHollow;
	String claspType;
	
	protected Chain(double weight,double price,String material,String color,
	      double length,String design,String brand,int purity,
	      boolean isHollow,String claspType){
			  
		this.weight = weight;
		this.price = price;
		this.material = material;
		this.color = color;
		this.length = length;
		this.design = design;
		this.brand = brand;
		this.purity = purity;
		this.isHollow = isHollow;
		this.claspType = claspType;
		
		System.out.println("=======Executing the Constructor=====");
	}

	void show(){
		System.out.println("---------Accessing instance var in method--------");
		
		System.out.println("Weight : " + weight);
		System.out.println("Price : " + price);
		System.out.println("Material : " + material);
		System.out.println("Color : " + color);
		System.out.println("Length : " + length);
		System.out.println("Design : " + design);
		System.out.println("Brand : " + brand);
		System.out.println("Purity : " + purity);
		System.out.println("Is Hollow : " + isHollow);
		System.out.println("Clasp Type : " + claspType);
	}
		
}