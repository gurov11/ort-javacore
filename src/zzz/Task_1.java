package zzz;

public class Task_1 {

	public static void main(String[] args) {
		final int numberOfPoints = 5;
		Point[] points = new Point[numberOfPoints];
		points[0] = new Point(1, 80, "a");
		points[1] = new Point(8, 7, "l");
		points[2] = new Point(14, -5, "s");
		points[3] = new Point(4, -17, "q");
		points[4] = new Point(1, -1, "g");

		for (int i = numberOfPoints - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				double m = distanceBetweenPoints(points[j].getX(), points[j].getY());

				double r = distanceBetweenPoints(points[j + 1].getX(), points[j + 1].getY());
				if (m > r) {
					Point tmp = points[j];
					points[j] = points[j + 1];
					points[j + 1] = tmp;
				}

			}
		}
		for (int i = 0; i < numberOfPoints; i++) {
			System.out.println(toString(points[i]));

		}

	}

	private static double distanceBetweenPoints(int coordinateX, int coordinateY) {
		double m = Math.sqrt(coordinateX * coordinateX + coordinateY * coordinateY);

		return m;
	}

	private static String toString(Point p) {
		StringBuilder str = new StringBuilder();
		str.append(p.getName()).append(": ").append(p.getX()).append(" ").append(p.getY());

		return str.toString();
	}
}
