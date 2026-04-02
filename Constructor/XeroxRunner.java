class XeroxRunner{
	public static void main(String[] args) {
		
		Xerox xerox1 = new Xerox("WorkCentre 3025", "Xerox", 15000, "Laser", 20, false, "A4", 350, "USB", true);
		xerox1.show();
		
		Xerox xerox2 = new Xerox("EcoTank L3250", "Epson", 18000, "Inkjet", 33, true, "A4", 250, "WiFi", true);
		xerox2.show();
		
		Xerox xerox3 = new Xerox("LaserJet Pro MFP", "HP", 22000, "Laser", 28, false, "A4/A3", 400, "WiFi + USB", true);
		xerox3.show();
	}
}