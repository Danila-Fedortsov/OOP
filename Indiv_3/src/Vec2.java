public class Vec2 {
	Point p1, p2;
	
	Vec2(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	Point norm()
	{
		return new Point(p2.x - p1.x, p2.y - p1.y);
	}
	
	static double vecMult(Vec2 v1, Vec2 v2)
	{
		return v1.norm().x * v2.norm().y - v1.norm().y * v2.norm().x;
	}
}
