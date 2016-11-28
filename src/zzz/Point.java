package zzz;

public class Point {
	private int coordinateX;
	private int coordinateY;
	private String nameOfPoint;

	public Point(int x, int y, String name) {
		coordinateX = x;
		coordinateY = y;
		nameOfPoint = name;
	}

	public int getX() {
		return coordinateX;
	}

	public int getY() {
		return coordinateY;
	}

	public String getName() {
		return nameOfPoint;
	}
}
