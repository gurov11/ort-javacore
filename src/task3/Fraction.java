package task3;

public class Fraction {
	private int _numerator;

	private int _denominator;

	public Fraction(int numerator, int denominator) {
		this._numerator = numerator;
		if (denominator < 0) {
			System.err.println("Fractional part is incorrect! ");
			this._denominator = denominator * (-1);
		} else {
			this._denominator = denominator;
		}
	}

	public Fraction() {
	}

	public Fraction additional(Fraction f) {
		Fraction sum = new Fraction();
		sum.setDenominator(Fraction.NOK(this.getDenominator(), f.getDenominator()));
		sum.setNumerator((sum.getDenominator() / this.getDenominator() * this.getNumerator())
				+ (sum.getDenominator() / f.getDenominator() * f.getNumerator()));
		return sum;
	}

	public Fraction substraction(Fraction f) {
		Fraction differ = new Fraction();
		differ.setDenominator(Fraction.NOK(this.getDenominator(), f.getDenominator()));
		differ.setNumerator((differ.getDenominator() / this.getDenominator() * this.getNumerator())
				- (differ.getDenominator() / f.getDenominator() * f.getNumerator()));

		return differ;
	}

	public Fraction multiplication(Fraction f) {
		Fraction multip = new Fraction();
		multip.setDenominator(this.getDenominator() * f.getDenominator());
		multip.setNumerator(this._numerator * f._numerator);
		return multip;
	}

	public Fraction division(Fraction f) {
		Fraction div = new Fraction();
		div.setDenominator(this.getDenominator() * f.getNumerator());
		div.setNumerator(this._numerator * f._denominator);
		if (div._numerator < 0 && div._denominator < 0) {
			div._numerator *= -1;
			div._denominator *= -1;
		}
		if (div._denominator < 0) {
			div._numerator *= -1;
			div._denominator *= -1;
		}
		return div;
	}

	public int getNumerator() {
		return _numerator;
	}

	public int getDenominator() {
		return _denominator;
	}

	public void setNumerator(int numerator) {
		this._numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this._denominator = denominator;
	}

	private static int NOK(int x, int n) {
		int j;
		if (x < n)
			j = n;
		else
			j = x;
		boolean t = true;
		while (t) {
			if ((j % x == 0) && (j % n == 0))
				break;
			else
				j += 1;
		}
		return j;
	}

}
