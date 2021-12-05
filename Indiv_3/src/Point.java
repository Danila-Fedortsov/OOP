
public class Point {
	float x, y;

	Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	double len(Point v)
	{
		return Math.sqrt((x - v.x) * (x - v.x) + (y - v.y) * (y - v.y));
	}
}
