
public class SLRCamera extends PhotoCamera {
	String lensThrType;
	int colDepth, formatA, formatB;
	boolean flash;
	
	SLRCamera(double ppiSc, double ppiM, double weight, double l, double w, double h, double iso, 
			String brand, String country, String lensThrType, int colDepth, int formatA, int formatB, boolean flash){
		super(ppiSc, ppiM, weight, l, w, h, iso, brand, country);
		this.lensThrType = lensThrType;
		this.colDepth = colDepth;
		this.formatA = formatA;
		this.formatB = formatB;
		this.flash = flash;
	}
	
	void print() {
		super.print();
		System.out.println("Тип резьбы: " + lensThrType);
		System.out.println("Глубина цвета: " + colDepth);
		System.out.println("Формат кадра: " + formatA + ":" + formatB);
		String z = flash? "Есть" : "Нет";
		System.out.println("Вспышка: " + z);
	}
	
	void setLensThrType(String x) {
		this.lensThrType = x;
	}
	
	void setColDepth(int x) {
		this.colDepth = x;
	}
	
	void setFormat(int a, int b) {
		this.formatA = a;
		this.formatB = b;
	}
	
	void setFlash(boolean x) {
		this.flash = x;
	}
	
	String getLensThrType() {
		return lensThrType;
	}
	
	int getColDepth() {
		return colDepth;
	}
	
	int[] getFormat() {
		int[] a = new int[2];
		a[0] = formatA;
		a[1] = formatB;
		return a;
	}
	
	boolean getFlash() {
		return flash;
	}
}
