package hu.szamalk.nezet;

import hu.szamalk.modell.Festmeny;
import hu.szamalk.modell.Gyujtemeny;
import hu.szamalk.modell.Mutargy;
import hu.szamalk.modell.Szobor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Konzol {


    public static void main(String[] args) {
        new Konzol();
    }


    public Konzol() {

     Gyujtemeny gy=new Gyujtemeny();



       }

    public static void konzolraIr( List<Mutargy> mutargyak){


        // mutargyak.forEach(System.out::println);

        for(Mutargy mutargy:mutargyak){
            System.out.println(mutargy);}

    }

    public void filebaIr() throws IOException {

        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("kiir.dat"));
        try {
            oos.writeObject(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




  }
???
