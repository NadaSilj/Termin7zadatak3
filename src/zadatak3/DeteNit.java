package zadatak3;

public class DeteNit extends Thread {

	private String ime;
	private int pojedenoKolaca = 0;
	// ovo je lokalna promenjljiva samo da bih znao koliko je dete pojelo kolača

	public DeteNit(String ime) {
		this.ime = ime;
	}

	@Override
	public void run() {

		do {
			try {
				this.sleep(500);
				Pekara.brojKolaca--;
				syncOut(ime + " jede kolač! Ostalo ih je " + Pekara.brojKolaca);
				pojedenoKolaca++;

			} catch (Exception e) {
				e.printStackTrace();
			}

		} while (pojedenoKolaca < 5 && Pekara.brojKolaca != 0);
		// ovde sam morao stavljati <5 i !=0 zbog do...while koje se uvek bar jednom izvrši

	}

	// ovo je sinhronizovani izlaz tj. ispis
	public void syncOut(String s) {
		synchronized (System.out) {
			System.out.println(s);
		}
	}
}
