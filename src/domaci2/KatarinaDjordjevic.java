package domaci2;
import java.util.Scanner;

public class KatarinaDjordjevic {
	String s1, s2, s3;

	public KatarinaDjordjevic() {
		try {
			Scanner sc = new Scanner(System.in);
			this.s1 = sc.nextLine();
			this.s2 = sc.nextLine();
			sc.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void ispisiS3() {
		System.out.println(this.s2+"|"+obrni(this.s1));
	}
	
	public String obrni(String aStr) {
		char[] original = aStr.toCharArray();
		char[] obrnuti = new char[original.length];
		int j=0;
		for(int i=original.length-1;i>=0;i--) {
			obrnuti[i]=original[j];
			j++;
		}
		return new String(obrnuti);
	}
}
