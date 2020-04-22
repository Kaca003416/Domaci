package domaci1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	//atributi
	ArrayList<String> niz     = new ArrayList<String>();
	ArrayList<String> noviNiz = new ArrayList<String>();

		public void run() {
			unesi();
			izbaciDuplikate();
			stampaj();
	}
		public void unesi() {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Unesite niz znakova ili recenica (za kraj unesite \'end\'):\n");
				while(true) {
					String x = sc.nextLine();
					if(!x.equals("end")) {
						this.niz.add(x);	
					}else {
						sc.close();
						break;
						
					}
				}
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
		}
		
		public void izbaciDuplikate(){
			for(String s:this.niz) {	
				if(this.noviNiz.contains(s)) {
					continue;
				}else {
					this.noviNiz.add(s);
				}

			}			
		}
		public void stampaj() {
			System.out.println("Ulazni niz"+this.niz);
			System.out.println("Niz bez duplikata"+this.noviNiz);
		}
		
		public static void main(String args[]) {
			Main glavna = new Main();
			glavna.run();
		}
	
	
	
}
