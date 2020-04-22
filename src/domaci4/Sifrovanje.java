package domaci4;

public class Sifrovanje {

    public String sifrujTekst(String aTekst, int kljuc) {
        char[] poruka = aTekst.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < aTekst.length(); i++) {
            int ascii = (int) poruka[i] + kljuc;
            char slovo = (char) ascii;
            if (((int) poruka[i] >= 65 && (int) poruka[i] <= 90) || ((int) poruka[i] >= 97 && (int) poruka[i] <= 122)) {
                if ((int) slovo <= 90 + kljuc && (int) slovo >= 90) {
                    int asciiNazad = ascii - 26;
                    sb.append((char) asciiNazad);
                }
                if ((int) slovo <= 122 + kljuc && (int) slovo >= 122) {
                    int asciiNazad = ascii - 26;
                    sb.append((char) asciiNazad);
                }
                if ((int) slovo >= 65 && (int) slovo < 90 - kljuc) {
                    sb.append((char) ascii);
                }
                if ((int) slovo >= 97 && (int) slovo < 122 - kljuc) {
                    sb.append((char) ascii);
                }

            } else {
                sb.append(poruka[i]);
            }
        }
        return sb.toString();

    }

    public String desifrujTekst(String aTekst, int kljuc) {
        char[] poruka = aTekst.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < aTekst.length(); i++) {
            if (((int) poruka[i] >= 65 && (int) poruka[i] <= 90) || ((int) poruka[i] >= 97 && (int) poruka[i] <= 122)) {
                int ascii = (int) poruka[i] - kljuc;
                char slovo = (char) ascii;
                if ((int) slovo <= 90 - kljuc && (int) slovo >= 90) {
                    int asciiNazad = ascii + 26;
                    sb.append((char) asciiNazad);
                }
                if ((int) slovo <= 122 - kljuc && (int) slovo >= 122) {
                    int asciiNazad = ascii - 26;
                    sb.append((char) asciiNazad);
                }
                if ((int) slovo >= 65 && (int) slovo < 90 + kljuc) {
                    sb.append((char) ascii);
                }
                if ((int) slovo >= 97 && (int) slovo < 122 + kljuc) {
                    sb.append((char) ascii);
                }

            } else {
                sb.append(poruka[i]);
            }

        }

        return sb.toString();

    }

}
