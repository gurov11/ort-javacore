package task10;

public class Main {

	public static void main(String[] args) {
		Passport ps = new Passport("������","�������","���������","11.06.2005","��������������","����. ��.������ 27","�������");
		InternationalPassport ip = new InternationalPassport("�������","������","�����������", "11.25.1994","���������������", "��������������, ��. ������ 5","�������",142152,"����������","11.05.2016","30.05.2016");
		StringBuilder str = new StringBuilder();
		StringBuilder br = new StringBuilder();
		str.append(ps.get_surname()).append(" ").append(ps.get_name()).append(" ").append(ps.get_pathronymic()).append(" ").append(ps.get_dateOfBirth()).append(" ") .append(ps.get_placeOfBirth()).append(" ").append(ps.get_sex()).append(" ").append(ps.get_location());
		br.append(ip.get_surname()).append(" ").append(ip.get_name()).append(" ").append(ip.get_pathronymic()).append(" ").append(ip.get_dateOfBirth()).append(" ") .append(ip.get_placeOfBirth()).append(" ").append(ip.get_sex()).append(" ").append(ip.get_location()).append(" ").append(Visa.get_typeOfVise()).append(" ").append(Visa.get_dateOfOpening()).append(" ").append(Visa.get_dateOfClosing());
		System.out.println(str.toString());
		System.out.println(br.toString());

	}

}
