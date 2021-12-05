import java.util.ArrayList;

public class Geometry {

	static boolean linesIntersect(Vec2 main1, Vec2 main2) {
		Vec2 v1 = new Vec2(main1.p1, main2.p1);
		Vec2 v2 = new Vec2(main1.p1, main2.p2);

		if (Vec2.vecMult(main1, v1) * Vec2.vecMult(main1, v2) <= 0) {
			v1 = new Vec2(main2.p1, main1.p1);
			v2 = new Vec2(main2.p1, main1.p2);
			return Vec2.vecMult(main2, v1) * Vec2.vecMult(main2, v2) <= 0;
		}

		return false;
	}

	static boolean isIntersect(Rectangle F1, Pentagon F2) {
		for (int i = 0; i < 3; i++) {
			Vec2 main1 = new Vec2(F1.fig.get(i), F1.fig.get(i + 1));
			for (int j = 0; j < 4; j++) {
				Vec2 main2 = new Vec2(F2.fig.get(j), F2.fig.get(j + 1));
				if (linesIntersect(main1, main2))
					return true;

				if (j == 3) {
					main2 = new Vec2(F2.fig.get(4), F2.fig.get(0));
					if (linesIntersect(main1, main2))
						return true;
				}
			}

			if (i == 2) {
				main1 = new Vec2(F1.fig.get(3), F1.fig.get(0));
				for (int j = 0; j < 4; j++) {
					Vec2 main2 = new Vec2(F2.fig.get(j), F2.fig.get(j + 1));
					if (linesIntersect(main1, main2))
						return true;

					if (j == 3) {
						main2 = new Vec2(F2.fig.get(4), F2.fig.get(0));
						if (linesIntersect(main1, main2))
							return true;
					}
				}
			}
		}
		return false;
	}

	static boolean isInclude(Rectangle F1, Pentagon F2) {
		if (Geometry.isIntersect(F1, F2))
			return false;

		ArrayList<Boolean> f = new ArrayList<>(4);
		Point p = F2.fig.get(0);
		for (int j = 0; j < 3; j++) {
			Vec2 v = new Vec2(F1.fig.get(j), F1.fig.get(j + 1));
			f.add((v.p2.x - v.p1.x) * (p.y - v.p1.y) - (p.x - v.p1.x) * (v.p2.y - v.p1.y) > 0);

			if (j == 2) {
				v = new Vec2(F1.fig.get(3), F1.fig.get(0));
				f.add((v.p2.x - v.p1.x) * (p.y - v.p1.y) - (p.x - v.p1.x) * (v.p2.y - v.p1.y) > 0);
			}
		}
		
		return f.get(0) == f.get(1) && f.get(0) == f.get(2) && f.get(0) == f.get(3);
	}
}

//