package domaci3;

public class TestOsoba {

	public static void main(String args[]) {
		Osoba o1 = new Osoba();
		Osoba o2 = new Osoba();

		o1.setIme("Pera");
		o1.setPrezime("Peric");
		o1.setJmbg("1010980710034");

		o2.setIme("Pera");
		o2.setPrezime("Peric");
		o2.setJmbg("1010980710034");

		if (o1.equals(o2)) {
			System.out.println("Osobe su iste!");
		} else {
			System.out.println("Osobe nisu iste!");
		}
	}
}
