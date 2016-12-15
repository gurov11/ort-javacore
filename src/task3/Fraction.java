package task3;

public class Fraction {
	private int _integerPartOfNumber;
	private int _fractionalPartOfNumber;

	public Fraction(int integerPartOfNumber, int fractionalPartOfNumber) {
		this._integerPartOfNumber = integerPartOfNumber;
		if (fractionalPartOfNumber < 0) {
			System.err.println("Fractional part is incorrect! ");
			this._fractionalPartOfNumber = fractionalPartOfNumber * (-1);
		} else {
			this._fractionalPartOfNumber = fractionalPartOfNumber;
		}
	}

	public static double additional(Fraction f1, Fraction f2) {
		double sum = Fraction.fractionalNumber(f1) + Fraction.fractionalNumber(f2);
		return sum;
	}

	public static double substraction(Fraction f1, Fraction f2) {
		double differ = Fraction.fractionalNumber(f1) - Fraction.fractionalNumber(f2);
		return differ;
	}

	public static double multiplication(Fraction f1, Fraction f2) {
		double multip = Fraction.fractionalNumber(f1) * Fraction.fractionalNumber(f2);
		return multip;
	}

	public static double division(Fraction f1, Fraction f2) {
		if (Fraction.fractionalNumber(f1) == 0) {
			double div = Fraction.fractionalNumber(f2) / Fraction.fractionalNumber(f1);
			return div;
		}

		else {
			double div = Fraction.fractionalNumber(f1) / Fraction.fractionalNumber(f2);
			return div;
		}
	}

	private static double fractionalNumber(Fraction f) {
		double fractionalNumber = 0;
		double fractionalPart = f.get_fractionalPartOfNumber();
		while (fractionalPart > 1) {
			fractionalPart /= 10;
		}
		if (f.get_integerPartOfNumber() < 0) {
			fractionalNumber = f.get_integerPartOfNumber() - fractionalPart;
		} else {
			fractionalNumber = f.get_integerPartOfNumber() + fractionalPart;
		}
		return fractionalNumber;
	}

	public int get_integerPartOfNumber() {
		return _integerPartOfNumber;
	}

	public int get_fractionalPartOfNumber() {
		return _fractionalPartOfNumber;
	}

}
