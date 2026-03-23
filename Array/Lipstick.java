class Lipstick{
	public static void main(String[] args){
		
		String[] lipstickBrands = {
            "Lakme", "Maybelline", "MAC", "Nykaa", "Colorbar",
            "Revlon", "Faces", "Sugar", "Chambor", "Elle18"
        };
		
		
		int size = lipstickBrands.length;
		System.out.println("The length of the lipstickBrands " +size);
		
		
		
		for(int start = 0 ; start < size ;start++){
			
			String ref = lipstickBrands[start];
			
			System.out.println("The pos @ lipstickBrands : " +ref );
			
			
		}

	}
}