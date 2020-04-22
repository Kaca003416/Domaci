package domaci5;
//zadatak 31
import java.io.File;
import java.io.PrintWriter;

public class WriteBanka {

	public static void main(String[] args) {
		Banka b = new Banka(10);
		b.unosNovogKredita(3000);
		b.unosNovogKredita(2000);
		b.unosNovogKredita(5000);
		b.unosNovogKredita(15000);
		b.unosNovogKredita(12000);
		// b.unosNovogKredita(0);
		// b.proveraMesecnaRata();
		try {
			File fajl = new File("filesdz4/banka.txt");
			fajl.createNewFile();
			if(fajl.exists()) {
				System.out.println("Postoji");
				PrintWriter p = new PrintWriter(fajl);	
				for (int i = 0; i < b.proveraMesecnaRata().length; i++) {
					p.print(b.proveraMesecnaRata()[i]+"\r\n");
					System.out.println(b.proveraMesecnaRata()[i]);
				}
				p.flush();
				p.close();
			}
		} catch (Exception e) {
			e.getMessage();
		}
 

	}

}