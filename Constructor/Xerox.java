class Xerox{
	
	String modelName;
	String brand;
	double price;
	String printType;
	int speed;
	boolean isColor;
	String paperSize;
	double powerConsumption;
	String connectivity;
	boolean isDuplex;
	
	Xerox(String modelName,String brand,double price,String printType,
	       int speed,boolean isColor,String paperSize,
	       double powerConsumption,String connectivity,boolean isDuplex){
		
		this.modelName = modelName;
		this.brand = brand;
		this.price = price;
		this.printType = printType;
		this.speed = speed;
		this.isColor = isColor;
		this.paperSize = paperSize;
		this.powerConsumption = powerConsumption;
		this.connectivity = connectivity;
		this.isDuplex = isDuplex;
		
		System.out.println("=======Executing the Constructor=====");
	}
	
	void show(){
		
		System.out.println("---------Accessing instance var in method--------");
		
		System.out.println("Model Name : " + modelName);
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Print Type : " + printType);
		System.out.println("Speed (ppm) : " + speed);
		System.out.println("Color Printing : " + isColor);
		System.out.println("Paper Size : " + paperSize);
		System.out.println("Power Consumption : " + powerConsumption);
		System.out.println("Connectivity : " + connectivity);
		System.out.println("Duplex Printing : " + isDuplex);
	}
}