package zadatak3;

public class PekaraNit extends Thread {

	public PekaraNit() {
		setDaemon(true);
		// poenta ovoga je da stane kada se ostale glavne niti završe
		// ako ovog nema, pekar nastavlja da pavi kolače
	}

	@Override
	public void run() {
		do {

			try {
				this.sleep(200);
				Pekara.brojKolaca++;
				syncOut("Pekar je napravio kolače! Sada ih ima " + Pekara.brojKolaca);

			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);

	}

	public void syncOut(String s) {
		synchronized (System.out) {
			System.out.println(s);
		}
	}
}

