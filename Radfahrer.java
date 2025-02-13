package de.gfn.w2.donn;

public class Radfahrer implements Gast{

    private String name;

    public Radfahrer(String name) {
        this.name = name;
    }

    @Override
    public String ausruhen() {
        return "Radfahrer "+name+" ruht sich aus.";
    }

    @Override
    public String bewirten() {
        return "Er genießt seinen Radler.";
    }
}
