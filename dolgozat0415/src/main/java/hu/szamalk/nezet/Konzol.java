package hu.szamalk.nezet;

import hu.szamalk.modell.Gyujtemeny;
import hu.szamalk.modell.Mutargy;

import java.io.*;
import java.util.List;

public class Konzol {


    public static void main(String[] args) {
        new Konzol();
    }

    Gyujtemeny gy;

    public Konzol() {
    gy= new Gyujtemeny();
        konzolraIr();
        filebaIr();
        List<Mutargy> beolvasottMutargyak = beolvasMutargyak();
        System.out.println(beolvasottMutargyak.get(0));


    }

    public  void konzolraIr() {


        // mutargyak.forEach(System.out::println);

        for (Object mutargy : gy.getMutargyak()) {
            System.out.println(mutargy);
        }

    }

    public void filebaIr()  {
        try {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("kiir.dat"));

            oos.writeObject(gy.getMutargyak());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  List<Mutargy> beolvasMutargyak() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("kiir.dat"))) {
            return (List<Mutargy>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Hiba történt a fájl beolvasása közben", e);
        }
    }


}

