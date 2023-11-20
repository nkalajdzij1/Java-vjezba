package ba.unsa.etf.rpr;
import java.lang.String;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.lang.Character;

public class najduziString {
    public static void main(String[] args){
        Scanner ulaz= new Scanner(System.in);
        System.out.println("Unesite recenicu, a ja cu vam vratiti najduzu rijec u recenici :) ");
        String recenica = ulaz.nextLine();

        int n=recenica.length();
        //recenica=recenica.toLowerCase();
        int pocetak=0;
        int kraj=0;
        int duzina=0;
        int brojac=0;
        int i=0;
        int pocetak_rez=0;
        int kraj_rez=0;
        /*StringBuilder pomocni= new StringBuilder();
            pomocni.append(recenica.charAt(i));*/
        //String[] niz= recenica.split(" ");
String proba= new String(recenica+" "+"Nedim");
System.out.println(proba);
        while(true){

            while(Character.isLetter(recenica.charAt(i))){

                brojac++;
                kraj++;
                i++;
                if(i==n)break;
            }

            if(duzina<brojac){
                duzina=brojac;
                pocetak_rez=pocetak;
                kraj_rez=kraj;
            }
            pocetak=kraj;
            brojac=0;

            if(i==n)break;
            while(!Character.isLetter(recenica.charAt(i))){

                pocetak++;
                kraj++;
                i++;
                if(i==n)break;
            }
            if(i==n)break;

        }
        for(int j=0; j<n; j++){
            if(j==pocetak_rez){
                while(pocetak_rez!=kraj_rez){
                    System.out.print(recenica.charAt(j));
                    j++;
                    pocetak_rez++;
                }
            }
        }

    }
}
