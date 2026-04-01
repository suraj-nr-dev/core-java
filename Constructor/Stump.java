class Stump{
	
String material;
int height;
float diameter;
String color;
float weight;
boolean isUsed;
String brand;
String country;
int price;
int durability;

	Stump(String material,int height,float diameter,String color,float weight,boolean isUsed,String brand,String country,int price,int durability){
		
		this.material = material;
        this.height = height;
        this.diameter = diameter;
        this.color = color;
        this.weight = weight;
        this.isUsed = isUsed;
        this.brand = brand;
        this.country = country;
        this.price = price;
        this.durability = durability;
		
		System.out.println("Updating the this keyword ....");
	}


}