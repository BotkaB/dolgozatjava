package hu.szamalk.modell;

import java.text.Collator;
import java.util.Comparator;

public class Szobor extends Mutargy implements Comparable<Szobor>{

    private final String anyag;
    private final int szazad;



    public Szobor(String alkoto, String cim, Kategoriak kategoria, String anyag, int szazad)  throws SzazadNagyobbMint21 {
        super(alkoto, cim, kategoria);
        this.anyag=anyag;
        szazadNagyobbMint21(szazad);
        this.szazad=szazad;


    }

    public Szobor(String alkoto, String cim, Kategoriak kategoria, String anyag) throws SzazadNagyobbMint21 {
        this(alkoto, cim, kategoria, anyag, 20);
    }

    private void szazadNagyobbMint21(int szazad)  throws SzazadNagyobbMint21{
        if(szazad>21){
            throw new SzazadNagyobbMint21("Század nagyobb, mint 21."+szazad);
        }
    }

    public String getAnyag() {
        return anyag;
    }

    public int getSzazad() {
        return szazad;
    }

    @Override
    public int compareTo(Szobor masik) {
     return this.getAlkoto().compareTo(masik.getAlkoto());
    }

    public class SzazadComparator implements Comparator<Szobor>{
        @Override
        public int compare(Szobor egyik, Szobor masik) {
           return egyik.getSzazad()-masik.getSzazad();
        }
    }

    public class AnyagComparator implements Comparator<Szobor>{
        @Override
        public int compare(Szobor egyik, Szobor masik) {
            return egyik.getAnyag().compareTo(masik.getAnyag());
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Szobor{" +
                "anyag='" + anyag + '\'' +
                ", szazad=" + szazad +
                '}';
    }
}
