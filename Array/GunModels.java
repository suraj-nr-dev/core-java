class GunModels{
	public static void main(String[] args){
		
	String[] gunModels = {
    "AK-47", "AK-74", "M16", "M4 Carbine", "Glock 17",
    "Glock 19", "Desert Eagle", "MP5", "Uzi", "FN SCAR",
    "Barrett M82", "Remington 870", "Mossberg 500", "Colt 1911",
    "SIG Sauer P320", "Beretta M9", "HK416", "FAMAS", "Steyr AUG",
    "Tavor X95", "CZ-75", "Ruger AR-556", "Winchester Model 70",
    "Springfield XD", "Walther PPK", "Dragunov SVD", "Lee-Enfield",
    "Thompson SMG", "Browning M2", "FN Five-seven"
		};
		
		int size = gunModels.length;
		System.out.println("The length of gun models : " +size);
		
		for(int start = 0; start<size; start++){
			
			String ref = gunModels[start];
			
			System.out.println("The gun models @ pos : " +ref);
		}
	}
}