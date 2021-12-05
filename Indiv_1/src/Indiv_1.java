import java.util.*;

public class Indiv_1 {

	public static void main(String[] args) {
		boolean flash;
		int colDepth, formatA, formatB;
		double ppiSc, ppiM, weight, l, w, h, iso;
		String brand, country, lensThrType;
		PhotoCamera ph1;
		SLRCamera ph2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите данные: ");
		
		ppiSc = sc.nextDouble();
		ppiM = sc.nextDouble();
		weight = sc.nextDouble();
		l = sc.nextDouble();
		w = sc.nextDouble();
		h = sc.nextDouble();
		iso = sc.nextDouble();
		brand = sc.next();
		country = sc.next();
		
		ph1 = new PhotoCamera(ppiSc, ppiM, weight, l, w, h, iso, brand, country);
		
		ppiSc = sc.nextDouble();
		ppiM = sc.nextDouble();
		weight = sc.nextDouble();
		l = sc.nextDouble();
		w = sc.nextDouble();
		h = sc.nextDouble();
		iso = sc.nextDouble();
		brand = sc.next();
		country = sc.next();
		lensThrType = sc.next();
		colDepth = sc.nextInt();
		formatA = sc.nextInt();
		formatB = sc.nextInt();
		flash = sc.hasNext();
		
		ph2 = new SLRCamera(ppiSc, ppiM, weight, l, w, h, iso, brand, country, lensThrType, colDepth, formatA, formatB, flash);
		
		ph1.print();
		ph2.print();
		
		sc.close();
	}

}
