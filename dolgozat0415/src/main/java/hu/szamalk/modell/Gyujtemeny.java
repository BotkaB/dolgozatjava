package hu.szamalk.modell;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Gyujtemeny<Stringbuilder> {

    private List<Mutargy> mutargyak;
    private List<Festmeny> festmenyek;
    private List <Szobor> szobrok;

    public Gyujtemeny() {

        mutargyak=new ArrayList<>();


        try {
            Festmeny festmeny1=new Festmeny("Monet", "Tavirozsak", Mutargy.Kategoriak.EREDETI, "impresszionista", "olaj");
            Festmeny festmeny2=new Festmeny("Renoir", "Furdozok", Mutargy.Kategoriak.KIS_ERTEK, "impresszionista", "olaj");
            Festmeny festmeny3=new Festmeny("Dali", "Hattyuk", Mutargy.Kategoriak.EREDETI, "szurrealista", "szen");
            Festmeny festmeny4=new Festmeny("Braque", "Gitar", Mutargy.Kategoriak.MASOLAT, "kubista", "vegyes");
            Szobor szobor1=new Szobor("Michelangelo", "David", Mutargy.Kategoriak.MASOLAT,"ko", 16);
            Szobor szobor2=new Szobor("Rodin", "A gondolkodó", Mutargy.Kategoriak.MASOLAT,"bronz", 19);

            mutargyak.add(szobor1);
            mutargyak.add(szobor2);
            mutargyak.add(festmeny1);
            mutargyak.add(festmeny2);
            mutargyak.add(festmeny3);
            mutargyak.add(festmeny4);

        }catch (SzazadNagyobbMint21 e){
            System.out.println("Hiba a festmény létrehozásakor:"+e.getMessage());
        }


    }

    public List<Mutargy> getMutargyak() {
        return mutargyak;
    }

    public List<Festmeny> getFestmenyek(){
        for(Mutargy mutargy: mutargyak){
            if(mutargy instanceof Festmeny){
                festmenyek.add((Festmeny) mutargy);
            }}
        return festmenyek;
    }


    public List<Szobor> getSzobrok(){
        for(Mutargy mutargy: mutargyak){
            if(mutargy instanceof Szobor){
                szobrok.add((Szobor) mutargy);
            }}
        return szobrok;
    }




    @Override
    public String toString() {
       Stringbuilder sb= (Stringbuilder) new StringBuilder("A gyűjteményben található műtárgyak:\n");
       for (Mutargy mutargy:mutargyak){
           ((StringBuilder) sb).append(mutargy).append("\n");}
       return sb.toString();


    }
}
