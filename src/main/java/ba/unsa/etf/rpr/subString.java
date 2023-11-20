package ba.unsa.etf.rpr;
import java.lang.String;
import java.util.*;
import java.lang.StringBuilder;
import java.lang.Character;

public class subString {
    public String dajNajduzuRijec(String unos) {

        int n = unos.length();
        int pocetak = 0;
        int kraj = 0;
        int duzina = 0;
        int duzina_niza=0;
        int i = 0;
        int j=0;
        String niz[]= new String[20];

        while (true) {

            while (Character.isLetter(unos.charAt(i))) {
                kraj++;
                i++;
                if (i==n) break;
            }
            niz[j]=unos.substring(pocetak, kraj);
            j++;
            duzina_niza++;

            if (i == n) break;
            pocetak = kraj;

            while (!Character.isLetter(unos.charAt(i))){

                pocetak++;
                kraj++;
                i++;

                if (i == n) break;
            }
            if (i == n) break;

        }
        String rijec=niz[0];
        for(int k=0; k<duzina_niza; k++){
            if(rijec.length()<=niz[k].length())rijec=niz[k];
        }
        return rijec;
    }



}
