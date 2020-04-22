package domaci3;

public class Osoba {
	private String ime = "N";
	private String prezime = "N";
	private String jmbg;


	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		try{
			this.ime = ime;
		}catch(NullPointerException e) {
			System.out.println("Uneli ste null vrednost");
		}
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		try{
		this.prezime = prezime;
	}catch(NullPointerException e) {
		System.out.println("Uneli ste null vrednost");
	}
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		try{
		this.jmbg = jmbg;
	}catch(NullPointerException e) {
		System.out.println("Uneli ste null vrednost");
	}
	}	
	@Override
		public String toString() {
			String s = "Ime: "+this.ime+"  Prezime: "+this.prezime+"  JMBG"+this.jmbg;
			return s;
		}
	@Override
		public boolean equals(Object obj) {
			if (obj == null) {
				System.out.println("Komparativni objekat je NULL");
				return false;
			} 
			if (obj == this) {
				 return true;
			}
		    if (!(obj instanceof Osoba)) {
		    	System.out.println("Komparativni objekat nije instanca klase Osoba");
		    	return false;
		    }
		    Osoba ob = (Osoba) obj;	
			if(this.ime == ob.ime && this.prezime == ob.prezime && this.jmbg == ob.jmbg) 
				return true;
			else
				return false;
			
		}
}