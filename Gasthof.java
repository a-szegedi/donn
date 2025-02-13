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
    public void addAll(Gast... liste){gaeste.addAll(List.of(liste));}
    public void bericht(){
        for (Gast gast: gaeste){
            System.out.println(gast.ausruhen());
            System.out.println(gast.bewirten());
        }
    }
}

interface Gast {
    String ausruhen();
    String bewirten();
}
