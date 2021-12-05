import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		float sumWeight = 0, sumHeight = 0;
		ArrayList<Athlete> athletesList = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			Athlete cur = new Athlete(sc.next(), sc.next(), sc.next(), sc.nextFloat(), sc.nextFloat());
			athletesList.add(cur);
			sumWeight += cur.weight;
			sumHeight += cur.height;
		}
		sumWeight /= n;
		sumHeight /= n;

		for (int i = 0; i < n; i++)
			if (athletesList.get(i).height > sumHeight && athletesList.get(i).weight < sumWeight)
				count++;

		System.out.println(count);

		sc.close();
	}

}

/*
2
andrew russia chess 180 60
alex usa soccer 170 70
*/