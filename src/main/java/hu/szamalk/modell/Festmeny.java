package hu.szamalk.modell;

public class Festmeny extends Mutargy {

    private final String stilus;
    private final String technika;

    public Festmeny(String alkoto, String cim, Kategoriak kategoria, String stilus, String technika) {
        super(alkoto, cim, kategoria);
        this.stilus = stilus;
        this.technika = technika;
    }

    public String getStilus() {
        return stilus;
    }

    public String getTechnika() {
        return technika;
    }


    @Override
    public String toString() {
        return super.toString() + "Festmeny{" +
                "stilus='" + stilus + '\'' +
                ", technika='" + technika + '\'' +
                '}';
    }
}
