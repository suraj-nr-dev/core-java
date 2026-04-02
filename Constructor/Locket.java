class Locket{

	double weight;
	double cost;
	String type;
	String material;
	String color;
	double length;
	boolean hasStone;
	String brand;
	int purity;
	String design;
	
	Locket(double weight,double cost,String type,String material,String color,
       double length,boolean hasStone,String brand,int purity,String design){
		
	this.weight = weight;
    this.cost = cost;
    this.type = type;
    this.material = material;
    this.color = color;
    this.length = length;
    this.hasStone = hasStone;
    this.brand = brand;
    this.purity = purity;
    this.design = design;
		
		System.out.println("=======Executing the Consturctor=====");
		
	}
	
	void show(){
	
	System.out.println("---------Accessing instance var in method--------");
	
	System.out.println("Weight : " + weight);
    System.out.println("Cost : " + cost);
    System.out.println("Type : " + type);
    System.out.println("Material : " + material);
    System.out.println("Color : " + color);
    System.out.println("Length : " + length);
    System.out.println("Has Stone : " + hasStone);
    System.out.println("Brand : " + brand);
    System.out.println("Purity : " + purity);
    System.out.println("Design : " + design);
		
		
	}
	


}