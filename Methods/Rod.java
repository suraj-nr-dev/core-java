class Rod{
	static void rod(){
		String type = "Metal";
		int size = 10;
		double weight = 25.00;
		double price = 2000;
		
		System.out.println("Type of Metal:"+type);
		System.out.println("Size :"+size);
		System.out.println("weight: "+weight);
		System.out.println("price: "+price);
	}
	static void rod(String type,int size,double weight,double price){
		
		System.out.println("price" +price);
		System.out.println("type :"+type);
		System.out.println("size : " +size);
		System.out.println("wt : " +weight);
	}
}