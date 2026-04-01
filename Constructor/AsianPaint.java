class AsianPaint {
	
	String colorName;
	int quantity;
	float pricePerLitre;
	String finishType;
	float durability;
	boolean isWaterproof;
	String brand;
	String country;
	int rating;
	int warranty;

	AsianPaint(String colorName,int quantity,float pricePerLitre,String finishType,float durability,
	boolean isWaterproof,String brand,String country,int rating,int warranty){
		
		this.colorName = colorName;
		this.quantity = quantity;
		this.pricePerLitre = pricePerLitre;
		this.finishType = finishType;
		this.durability = durability;
		this.isWaterproof = isWaterproof;
		this.brand = brand;
		this.country = country;
		this.rating = rating;
		this.warranty = warranty;

		System.out.println("Updating the this keyword ....");
	}
}