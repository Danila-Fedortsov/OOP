
public class AndArray implements Array {
	
	public static double[] sum(double[] a, double[] b) {
		int v1 = a.length, v2 = b.length, q = 0;
		boolean f = false;
		double[] c = new double[v1 < v2? v1 : v2], array;
		
		for (int i = 0; i < v1; i++) {
			for (int j = 0; j < v2 && !f; j++)
				if (a[i] == b[j]) {
					c[q] = a[i];
					q++;
					f = !f;
				}
			f = false;
		}
		array = new double[q];
		for (int i = 0; i < q; i++)
			array[i] =  c[i];
		return array;
	}
	
	public static double[] process(double[] a) {
		double[] c = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = Math.sqrt(a[i]);
		}
		return c;
	}
}
