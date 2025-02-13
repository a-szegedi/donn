package de.gfn.w2.donn;

import java.util.ArrayList;
import java.util.List;

public class Gasthof {

    private List<Gast> gaeste = new ArrayList<>();

    public Gasthof() {
    }
    public void add(Gast gast){
        gaeste.add(gast);
    }
    public void bericht(){
        for (Gast gast: gaeste){

        }
    }
}

interface Gast {

    String name = "";
    String[] ausruhen();
    String[] bewirten();
}
