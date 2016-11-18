package zzz;

public class Points {
	private int coordinateX;
	private int coordinateY;
	private String nameOfPoint;

	Points(int x, int y, String name) {
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
