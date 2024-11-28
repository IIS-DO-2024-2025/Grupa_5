package prototype;

import java.awt.Color;

import mvc.Point;

public class TestPrototype {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.BLACK);
		Point p2 = new Point(20, 20, Color.BLACK);
		
		Line line = new Line(p1, p2, Color.BLACK);
		
		// -------- Testiranje Line shallow clone ----------
		
		Line lineClone = line.clone();
		
		System.out.println(line);
		System.out.println(lineClone);
		
		line.getStartPoint().setX(70);
		System.out.println(lineClone.getStartPoint().getX());
		
		
		// ------- Testiranje Line Deep clone ------------
		Point p3 = new Point(30, 30, Color.BLACK);
		Point p4 = new Point(40, 40, Color.BLACK);
		
		LineDeep line2 = new LineDeep(p3, p4, Color.BLACK);
		LineDeep lineDeepClone = line2.clone();
		
		System.out.println(line2);
		System.out.println(lineDeepClone);
		
		line2.getStartPoint().setX(500);
		System.out.println(lineDeepClone.getStartPoint().getX());
	}

}
