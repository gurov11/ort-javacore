package task10;

public class Visa {
	private static String _typeOfVise;
	

	private static String _dateOfOpening;
	private static String _dateOfClosing;

	public Visa(String _typeOfVise, String _dateOfOpening, String _dateOfClosing) {
		super();
		this._typeOfVise = _typeOfVise;
		this._dateOfOpening = _dateOfOpening;
		this._dateOfClosing = _dateOfClosing;
	}
	public static String get_typeOfVise() {
		return _typeOfVise;
	}

	public void set_typeOfVise(String _typeOfVise) {
		this._typeOfVise = _typeOfVise;
	}

	public static String get_dateOfOpening() {
		return _dateOfOpening;
	}

	public void set_dateOfOpening(String _dateOfOpening) {
		this._dateOfOpening = _dateOfOpening;
	}

	public static String get_dateOfClosing() {
		return _dateOfClosing;
	}

	public void set_dateOfClosing(String _dateOfClosing) {
		this._dateOfClosing = _dateOfClosing;
	}
}
