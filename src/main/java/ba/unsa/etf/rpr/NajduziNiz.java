package ba.unsa.etf.rpr;
import java.util.*;

public class NajduziNiz {

    public static void main(String[] args) {
        int[] niz;
        niz = new int[10];

        Scanner ulaz= new Scanner(System.in);

        System.out.println("Unesite 10 elemenata niza: ");
        for(int i=0; i<10; i++){

            niz[i]=ulaz.nextInt();
        }
        int n=niz[0];
        for(int i=0; i<10; i++){
            if (niz[i]<n) {
                n=niz[i];
            }

        }
      /*int velicina = niz.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < 10; i++) {
                if (niz[i - 1] > niz[i]) {

                    int temp = niz[i - 1];
                    niz[i - 1] = niz[i];
                    niz[i] = temp;

                    swapped = true;
                }
            }

            velicina--;
        } while (swapped);
*/
        /*a moglo je i ovo

    import java.util.Arrays;
        Arrays.sort(myArray);
    import java.util.Collections;
 Arrays.sort(myArray, Collections.reverseOrder()); obrnuti redoslijed ali tip mora biiti <Integer> bas ovako napisano
 ZA OVO OBAVEZNO VELICINA NIZA MORA BIT TACNO ONOLIKO KOLIKO IMA ELEMENATA
Arrays.sort(niz,0,7); ili ovako od 0tog do 7og indeksa npr
      */
        Arrays.sort(niz);
        System.out.println("Sortirani niz je: ");
        for(int i=0; i<10; i++){
            System.out.println(niz[i]);
        }
        StringBuilder p= new StringBuilder();
        p.append("A");
        p.append("B");
        p.reverse();

        int brojac=0;
        int rezultat=0;
        System.out.println("Najmanji element je: "+n);
        for(int j=0; j<10; j++){
            if(niz[j]==n+brojac){
                rezultat++;
                brojac++;
            }
        }
        System.out.println("Najduzi sekvent je: "+rezultat);

        ;
    }

}