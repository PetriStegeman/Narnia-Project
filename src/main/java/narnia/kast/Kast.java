package narnia.kast;

import java.util.concurrent.ThreadLocalRandom;

public class Kast {
    private Materiaal materiaal;
    private boolean kastKapot;
    private boolean hasNarnia;

    public static Kast kastBuilder(){
        int materiaalKast = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        switch (materiaalKast) {
            case 1:
                return new Kast(Materiaal.HOUT);
            case 2:
                return new Kast(Materiaal.METAAL);
            case 3:
                return new Kast(Materiaal.STEEN);
            default:
                return new Kast(Materiaal.DIAMAND);
        }
    }

    public void schopTegenKast(Persoon mijnPersoon){
        switch (getMateriaal()) {
            case HOUT: {
                if (mijnPersoon.getPower() > 10) {
                    System.out.println("De kast is kapot!");
                    setKastKapot(true);
                } else {
                    System.out.println("De kast is nog heel!");
                    System.out.println("Je gaat de kast in...");
                }
                break;
            }
            case METAAL: {
                if (mijnPersoon.getPower() > 20) {
                    System.out.println("De kast is kapot!");
                    setKastKapot(true);
                } else {
                    System.out.println("De kast is nog heel!");
                    System.out.println("Je gaat de kast in...");
                }
                break;
            }
            case DIAMAND: {
                if (mijnPersoon.getPower() > 60) {
                    System.out.println("De kast is kapot!");
                    setKastKapot(true);
                } else {
                    System.out.println("De kast is nog heel!");
                    System.out.println("Je gaat de kast in...");
                }
                break;
            }
            default: {
                if (mijnPersoon.getPower() > 40) {
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

    public Materiaal getMateriaal() {
        return materiaal;
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


