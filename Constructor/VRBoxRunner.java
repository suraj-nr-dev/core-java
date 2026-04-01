class VRBoxRunner {
	public static void main(String[] args) {
		
		VRBox vr1 = new VRBox("VR1", 50, 110.5f, "Black", 0.5f, true, "Oculus", "USA", 5000, 1);
		System.out.println(vr1.model);
		System.out.println(vr1.lensSize);
		System.out.println(vr1.viewingAngle);
		System.out.println(vr1.color);
		System.out.println(vr1.weight);
		System.out.println(vr1.hasController);
		System.out.println(vr1.brand);
		System.out.println(vr1.country);
		System.out.println(vr1.price);
		System.out.println(vr1.warranty);
		System.out.println("=========================================");
		
		VRBox vr2 = new VRBox("VR2", 55, 120.0f, "White", 0.6f, false, "Sony", "Japan", 6000, 2);
		System.out.println(vr2.model);
		System.out.println(vr2.lensSize);
		System.out.println(vr2.viewingAngle);
		System.out.println(vr2.color);
		System.out.println(vr2.weight);
		System.out.println(vr2.hasController);
		System.out.println(vr2.brand);
		System.out.println(vr2.country);
		System.out.println(vr2.price);
		System.out.println(vr2.warranty);
		System.out.println("=========================================");

		VRBox vr3 = new VRBox("VR3", 60, 115.0f, "Gray", 0.7f, true, "HTC", "China", 7000, 2);
		System.out.println(vr3.model);
		System.out.println(vr3.lensSize);
		System.out.println(vr3.viewingAngle);
		System.out.println(vr3.color);
		System.out.println(vr3.weight);
		System.out.println(vr3.hasController);
		System.out.println(vr3.brand);
		System.out.println(vr3.country);
		System.out.println(vr3.price);
		System.out.println(vr3.warranty);
		System.out.println("=========================================");

		
	}
}