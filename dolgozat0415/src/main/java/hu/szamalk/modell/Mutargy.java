package hu.szamalk.modell;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Mutargy implements Serializable {

    public enum Kategoriak {EREDETI, MASOLAT, KIS_ERTEK}

    ;
    private UUID id;
    private String alkoto;
    private String cim;
    private Kategoriak kategoria;

    public Mutargy(String alkoto, String cim, Kategoriak kategoria) {
        this.alkoto = alkoto;
        this.cim = cim;
        this.kategoria = kategoria;
        setId();
    }

    public UUID getId() {
        return id;
    }

    public void setId() {
        this.id = java.util.UUID.randomUUID();
    }

    public String getAlkoto() {
        return alkoto;
    }

    public void setAlkoto(String alkoto) {
        this.alkoto = alkoto;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public Kategoriak getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoriak kategoria) {
        this.kategoria = kategoria;
    }

    private static void konzolraIr(String cim, List<Mutargy> mutargyak) {

        System.out.println(cim);
        // mutargyak.forEach(System.out::println);

        for (Mutargy mutargy : mutargyak) {
            System.out.println(mutargy);
        }

    }

    public void filebaIr() throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("kiir.dat"));
        try {
            oos.writeObject(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String toString() {
        return "Mutargy{" +
                "alkoto='" + alkoto + '\'' +
                ", cim='" + cim + '\'' +
                ", kategoria=" + kategoria +
                '}';
    }
}
