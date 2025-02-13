package de.gfn.w2.donn;

public class Wanderer implements Gast{

    private String name;

    public Wanderer(String name) {
        this.name = name;
    }

    @Override
    public String ausruhen() {
        return "Wanderer "+name+" ruht sich aus.";
    }

    @Override
    public String bewirten() {
        return "Er genießt seinen Käsebrot.";
    }
}
