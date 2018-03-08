package narnia.kast;

import java.util.concurrent.ThreadLocalRandom;

import static narnia.kast.Materiaal.*;

public class Kast {
    private Materiaal materiaal;
    private boolean kastKapot;
    private boolean hasNarnia;

    public static Kast kastBuilder(){
        int materiaalKast = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        switch (materiaalKast) {
            case 1:
                return new Kast(Materiaal.HOUT);
            case 2:
                return new Kast(Materiaal.METAAL);
            default:
                return new Kast(Materiaal.STEEN);
        }
    }

    public void schopTegenKast(Persoon mijnPersoon){
        switch (getMateriaal()) {
            case HOUT: {
                if (mijnPersoon.getPower() > 2) {
                    System.out.println("De kast is kapot!");
                    setKastKapot(true);
                } else {
                    System.out.println("De kast is nog heel!");
                    System.out.println("Je gaat de kast in...");
                }
                break;
            }
            case STEEN: {
                if (mijnPersoon.getPower() > 3) {
                    System.out.println("De kast is kapot!");
                    setKastKapot(true);
                } else {
                    System.out.println("De kast is nog heel!");
                    System.out.println("Je gaat de kast in...");
                }
                break;
            }
            default: {
                if (mijnPersoon.getPower() > 4) {
                    System.out.println("De kast is kapot!");
                    setKastKapot(true);
                } else {
                    System.out.println("De kast is nog heel!");
                    System.out.println("Je gaat de kast in...");
                }
            }
        }
    }

    public Kast(Materiaal materiaal) {
        this.materiaal = materiaal;
    }

    public Kast(boolean kastKapot) {
        this.kastKapot = kastKapot;
    }

    public Materiaal getMateriaal() {
        return materiaal;
    }

    public void setMateriaal(Materiaal materiaal) {
        this.materiaal = materiaal;
    }

    public boolean isKastKapot() {
        return kastKapot;
    }

    public void setKastKapot(boolean kastKapot) {
        this.kastKapot = kastKapot;
    }

    public boolean isHasNarnia() {
        return hasNarnia;
    }

    public void setHasNarnia(boolean hasNarnia) {
        this.hasNarnia = hasNarnia;
    }
}


