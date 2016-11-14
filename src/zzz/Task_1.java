package zzz;

public class Task_1 {

	public static void main(String[] args) {
		final int numberOfPoints = 5;
		Points[] points = new Points[numberOfPoints];
		points[0] = new Points(1, 80, "a");
		points[1] = new Points(8, 7, "l");
		points[2] = new Points(14, -5, "s");
		points[3] = new Points(4, -17, "q");
		points[4] = new Points(1, -1, "g");

		for (int i = numberOfPoints - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				double m = Math.sqrt(points[j].getX() * points[j].getX() + points[j].getY() * points[j].getY());
				double r=Math.sqrt(
						points[j + 1].getX() * points[j + 1].getX() + points[j + 1].getY() * points[j + 1].getY());
				if (m > r) {
					Points tmp = points[j];
					points[j] = points[j + 1];
					points[j+1] = tmp;
				}

			}
		}
for(int i = 0; i < numberOfPoints; i++){
	System.out.println(toString(points[i]));
	
}
		
	}
private static String toString(Points p){
	StringBuilder str = new StringBuilder();
	str.append(p.getName()).append(": ").append(p.getX()).append(" ").append(p.getY());
	
	return str.toString();
}
}
