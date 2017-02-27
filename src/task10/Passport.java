package task10;

public class Passport {
	private String _surname;

	private String _name;
	private String _pathronymic;
	private String _dateOfBirth;
	private String _placeOfBirth;
	private String _location;
	private String _sex;

	public Passport(String _surname, String _name, String _pathronymic, String _dateOfBirth, String _placeOfBirth,
			String _location, String _sex) {
		super();
		this._surname = _surname;
		this._name = _name;
		this._pathronymic = _pathronymic;
		this._dateOfBirth = _dateOfBirth;
		this._placeOfBirth = _placeOfBirth;
		this._location = _location;
		this._sex = _sex;
	}

	public void set_surname(String _surname) {
		this._surname = _surname;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_pathronymic() {
		return _pathronymic;
	}

	public void set_pathronymic(String _pathronymic) {
		this._pathronymic = _pathronymic;
	}

	public String get_dateOfBirth() {
		return _dateOfBirth;
	}

	public void set_dateOfBirth(String _dateOfBirth) {
		this._dateOfBirth = _dateOfBirth;
	}

	public String get_placeOfBirth() {
		return _placeOfBirth;
	}

	public void set_placeOfBirth(String _placeOfBirth) {
		this._placeOfBirth = _placeOfBirth;
	}

	public String get_location() {
		return _location;
	}

	public void set_location(String _location) {
		this._location = _location;
	}

	public String get_sex() {
		return _sex;
	}

	public void set_sex(String _sex) {
		this._sex = _sex;
	}

	public String get_surname() {
		return _surname;
	}
}
