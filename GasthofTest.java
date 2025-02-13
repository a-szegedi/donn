package de.gfn.w2.donn;

public class GasthofTest {
    public static void main(String[] args) {
        Gasthof gasthof = new Gasthof();
        Gast karl = new Wanderer("Karl");
        gasthof.add(karl);
        Gast max = new Radfahrer("Max");
        Gast otto = new Wanderer("Otto");
        Gast franz = new Radfahrer("Franz");
        Gast hans = new Wanderer("Hans");
        gasthof.addAll(max, otto, franz, hans);
        gasthof.bericht();

    }
}
