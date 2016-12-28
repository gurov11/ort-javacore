package task3;

public class Main {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2, 4);
		Fraction f2 = new Fraction(-1, 5);
		System.out.println("Первое число: " + f1.getNumerator() + "/" + f1.getDenominator());
		System.out.println("Второе число: " + f2.getNumerator() + "/" + f2.getDenominator());
		Fraction sum = f1.additional(f2);
		System.out.println("Сложение: " + sum.getNumerator() + "/" + sum.getDenominator());
		Fraction sub = f1.substraction(f2);
		System.out.println("Вычитание: " + sub.getNumerator() + "/" + sub.getDenominator());
		Fraction multip = f1.multiplication(f2);
		System.out.println("Умножение: " + multip.getNumerator() + "/" + multip.getDenominator());
		Fraction div = f1.division(f2);
		System.out.println("Деление: " + div.getNumerator() + "/" + div.getDenominator());

	}

}
