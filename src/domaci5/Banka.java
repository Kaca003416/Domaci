package domaci5;
import java.util.ArrayList;
public class Banka {
	// atributi
	protected double[] krediti;
	protected int brojKredita = 0;
	protected static int slobodnoMesto = 0;
	PolitikaBanke politikaBanke = new PolitikaBanke();

	// konstruktor
	public Banka(int aMaksBrojKredita) {
		// postavljanje maksimalnog broja kredita
		this.krediti = new double[aMaksBrojKredita];
		// inicijalizacija svih clanova na 0
		for (int i = 0; i < this.krediti.length; i++) {
			this.krediti[i] = 0;
		}
	}

	protected void unosNovogKredita(double aKredit) throws BankaException {
		if (aKredit <= 0 || slobodnoMesto > this.krediti.length) {
			throw new BankaException("Neispravan unos");
		} else {
			this.krediti[slobodnoMesto] = aKredit;
			slobodnoMesto++;
			System.out.println("Uspesno upisan na " + slobodnoMesto +". mesto");
		}

	}

	protected double[] proveraMesecnaRata() {
		double[] mesecneRate = new double[slobodnoMesto];
		ArrayList prosecneMesecneRateZaPrekoDesetHiljada = new ArrayList<Double>();
		for (int i = 0; i < slobodnoMesto; i++) {
			mesecneRate[i] = (double) (this.krediti[i] * (100 + politikaBanke.KAMATNA_STOPA)) / (100 * 12);
			if (this.krediti[i] > 10000) {
				prosecneMesecneRateZaPrekoDesetHiljada.add(mesecneRate[i]);
			}
		}
		double[] niz = new double[prosecneMesecneRateZaPrekoDesetHiljada.size()];
		for(int i=0;i<niz.length;i++) {
			niz[i]=(double)prosecneMesecneRateZaPrekoDesetHiljada.get(i);
			//System.out.println(niz[i]);
		}
		return niz;
	}

}
