import java.util.*;
public class Indiv_2 {

	public static void main(String[] args) {
		int n;
		double[] a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Размер: ");
		n = sc.nextInt();
		a = new double[n];
		System.out.println("Массив: ");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextDouble();
		
		System.out.println("Размер: ");
		n = sc.nextInt();
		b = new double[n];
		System.out.println("Массив: ");
		for (int i = 0; i < n; i++)
			b[i] = sc.nextDouble();
		
		Array.print(AndArray.sum(a, b));
		Array.print(AndArray.process(a));
		Array.print(OrArray.sum(a, b));
		Array.print(OrArray.process(a));
		
		sc.close();
	}

}
