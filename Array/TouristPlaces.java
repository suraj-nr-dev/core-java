class TouristPlaces{
	public static void main(String [] args) {
		String[] touristPlaces = {
    "Taj Mahal", "Eiffel Tower", "Great Wall of China", "Statue of Liberty",
    "Machu Picchu", "Colosseum", "Burj Khalifa", "Louvre Museum",
    "Santorini", "Bali", "Maldives", "Mount Everest", "Niagara Falls",
    "Grand Canyon", "Sydney Opera House", "Times Square", "Dubai Mall",
    "Golden Gate Bridge", "Angkor Wat", "Petra", "Big Ben",
    "Buckingham Palace", "Kedarnath", "Varanasi Ghats", "Hampi",
    "Mysore Palace", "Red Fort", "Gateway of India", "Goa Beaches",
    "Andaman Islands"
		};
		
		int size = touristPlaces.length;
		System.out.println("The length of Tourist places : " +size);
		
		for(int start = 0; start<size; start++){
			
			String ref = touristPlaces[start];
			
			System.out.println("The Tourist Places @ pos : " +ref);
		}
	}
}