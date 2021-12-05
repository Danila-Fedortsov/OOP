public class PhotoCamera {
	double ppiSc, ppiM, weight, l, w, h, iso;
	String brand, country;
	
	PhotoCamera(double ppiSc, double ppiM, double weight, double l, double w, double h, double iso, String brand, String country) {
		this.ppiSc = ppiSc;
		this.ppiM = ppiM;
		this.weight = weight;
		this.l = l;
		this.w = w;
		this.h = h;
		this.iso = iso;
		this.brand = brand;
		this.country = country;
	}
	
	void print() {
		System.out.println("Разрешение экрана: " + ppiSc + " ppi");
		System.out.println("Разрешение матрицы: " + ppiM + " ppi");
		System.out.println("Вес: " + weight + " г");
		System.out.println("Размеры: " + l + "x" + w + "x" + h);
		System.out.println("ISO: " + iso);
		System.out.println("Производитель: " + brand);
		System.out.println("Страна сборки: " + country);
	}
	
	void setPpiSc(double ppi) {
		this.ppiSc = ppi;
	}
	
	void setPpiM(double ppi) {
		this.ppiM = ppi;
	}
	
	void setWeight(double w) {
		this.weight = w;
	}
	
	void setSize(double len, double wid, double hei) {
		this.l = len;
		this.w = wid;
		this.h = hei;
	}
	
	void setISO(double iso) {
		this.iso = iso;
	}
	
	void setBrand(String br) {
		this.brand = br;
	}
	
	void setCountry(String c) {
		this.country = c;
	}
	
	double getPpiSc() {
		return ppiSc;
	}
	
	double getPpiM() {
		return ppiM;
	}
	
	double getWeight() {
		return weight;
	}
	
	double[] getSize() {
		double[] a = new double[3];
		a[0] = l;
		a[1] = w;
		a[2] = h;
		return a;
	}
	
	double getISO(double iso) {
		return iso;
	}
	
	String getBrand(String br) {
		return brand;
	}
	
	String getCountry(String c) {
		return country;
	}
	
	
}
