package zadatak3;

public class Pekara {

	public static volatile int brojKolaca = 5;

	public static void main(String[] args) {

		DeteNit d1 = new DeteNit("Aco");
		DeteNit d2 = new DeteNit("Mile");
		DeteNit d3 = new DeteNit("Jovo");
		DeteNit d4 = new DeteNit("Pero");

		PekaraNit p = new PekaraNit();

		p.start();
		d1.start();
		d2.start();
		d3.start();
		d4.start();

	}
}
