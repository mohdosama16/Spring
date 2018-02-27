package usama;

public class triangle {
	private Point PointA;
	private Point PointB;
	private Point PointC;
	public Point getPointA() {
		return PointA;
	}
	public void setPointA(Point pointA) {
		PointA = pointA;
	}
	public Point getPointB() {
		return PointB;
	}
	public void setPointB(Point pointB) {
		PointB = pointB;
	}
	public Point getPointC() {
		return PointC;
	}
	public void setPointC(Point pointC) {
		PointC = pointC;
	}
	
	public void area() {
		System.out.println("point A is = "+getPointA().getX()+","+getPointA().getY());
		
	}   

	
}
