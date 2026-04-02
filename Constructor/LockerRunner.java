class LockerRunner{
	public static void main(String[] args) {
		
		Locker locker1 = new Locker(101, "Bangalore Branch", 2.5, "Steel", true, "Digital", 3000, "SBI", "Small", 1234);
		locker1.show();
		
		Locker locker2 = new Locker(205, "Whitefield Branch", 5.0, "Alloy Steel", false, "Biometric", 5500, "HDFC", "Medium", 5678);
		locker2.show();
		
		Locker locker3 = new Locker(310, "Indiranagar Branch", 8.0, "Reinforced Steel", true, "Key + PIN", 8000, "ICICI", "Large", 9999);
		locker3.show();
	}
}