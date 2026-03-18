class Grocery{
	static void getPriceByName(String name){
		System.out.println("Grocery item Price by name : "+name);
		
		if("rice"==name){
			System.out.println("Price of "+name+" is : 60");
			return;
		}if("wheat"==name){
			System.out.println("Price of "+name+" is : 45");
			return;
		}if("salt"==name){
			System.out.println("Price of "+name+" is : 20");
			return;
		}if("oil"==name){
			System.out.println("Price of "+name+" is : 150");
			return;
		}if("Dal"==name){
			System.out.println("Price of "+name+" is : 90");
			return;
		}if("coffee"==name){
			System.out.println("Price of "+name+" is : 200");
			return;
		}if("oats"==name){
			System.out.println("Price of "+name+" is : 500");
			return;
		}if("tea"==name){
			System.out.println("Price of "+name+" is : 180");
			return;
		}if("butter"==name){
			System.out.println("Price of "+name+" is : 480");
			return;
		}if("cheese"==name){
			System.out.println("Price of "+name+" is : 120");
			return;
		}if("milk"==name){
			System.out.println("Price of "+name+" is : 52");
			return;
		}if("honey"==name){
			System.out.println("Price of "+name+" is : 300");
			return;
		}if("biscuit"==name){
			System.out.println("Price of "+name+" is : 200");
			return;
		}if("chips"==name){
			System.out.println("Price of "+name+" is : 180");
			return;
		}if("chicken"==name){
			System.out.println("Price of "+name+" is : 280");
			return;
		}if("mutton"==name){
			System.out.println("Price of "+name+" is : 780");
			return;
		}if("pepper"==name){
			System.out.println("Price of "+name+" is : 80");
			return;
		}
		System.out.println("No Grocery is matching");
	}
}