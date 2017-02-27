package task10;

public class InternationalPassport extends Passport {
	private int _foreignPassportNumber;
	private Visa visa;
	public InternationalPassport(String _surname, String _name, String _pathronymic, String _dateOfBirth,
			String _placeOfBirth, String _location, String _sex, int _foreignPassportNumber, 
			String typeOfVisa, String dataOfOpening, String dataOfClosing) {
		super(_surname, _name, _pathronymic, _dateOfBirth, _placeOfBirth, _location, _sex);
		Visa visa = new Visa(typeOfVisa, dataOfOpening, dataOfClosing);
		this._foreignPassportNumber = _foreignPassportNumber;
	}

	

}
