package task3;

public class Main {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1251, 32);
		Fraction f2 = new Fraction(-1, 0025);
		System.out.println("Первое число: " + f1.get_integerPartOfNumber() + "," + f1.get_fractionalPartOfNumber());
		System.out.println("Второе число: " + f2.get_integerPartOfNumber() + "," + f2.get_fractionalPartOfNumber());
		System.out.println("Сложение: " + Fraction.additional(f1, f2));
		System.out.println("Вычитание: " + Fraction.substraction(f1, f2));
		System.out.println("Умножение: " + Fraction.multiplication(f1, f2));
		System.out.println("Деление: " + Fraction.division(f1, f2));

	}

}
