
public class OrArray implements Array {
	
	public static double[] sum(double[] a, double[] b) {
		int v1 = a.length, v2 = b.length, q = v1;
		boolean f = true;
		double[] c = new double[v1 + v2], array;
		
		for (int i = 0; i < v1; i++)
			c[i] = a[i];
		
		for (int i = 0; i < v2; i++) {
			for (int j = 0; j < v1 && f; j++)
				if (b[i] == a[j])
					f = !f;
			if (f) {
				c[q] = b[i];
				q++;
			}
			f = true;
		}
		
		array = new double[q];
		for (int i = 0; i < q; i++)
			array[i] = c[i];
		return array;
	}
	
	public static double[] process(double[] a) {
		double[] c = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = Math.log(a[i]);
		}
		return c;
	}
}
