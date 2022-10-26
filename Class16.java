class CCircle1 // Šw¸qĂţ§OCCircle1
{
	private static double pi = 3.14;
	private double radius;

	public CCircle1(double r) // CCircle1ŤŘşc¤¸
	{
		radius = r;
	}

	public void show() {
		System.out.println("radius=" + radius);
		System.out.println("area=" + pi * radius * radius);
	}

}

public class Class16 {
	public static void main(String args[]) {
		CCircle1 cir[];
		cir = new CCircle1[6];
		for (int i = 0; i < cir.length; i++) {
			cir[i] = new CCircle1(i);
			cir[i].show();
		}

	}
}
