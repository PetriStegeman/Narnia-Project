package narnia.kast;

import java.util.concurrent.ThreadLocalRandom;

public class Nanny {

    private static final int nannyMightHear = 99;

    private boolean doesNannyHear;

    public Nanny(boolean doesNannyHear) {
        this.doesNannyHear = doesNannyHear;
    }

    public static Nanny nannyApproaches(int nannyMightHear) {

        int nannyRandom = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        if (nannyRandom > nannyMightHear) {
            System.out.println("De Nanny heeft je betrapt! Bad boy/girl/other!");
            return new Nanny(true);
        }
        else {
            return new Nanny(false);
        }
    }

    public void nannyPunishment(){
        if (doesNannyHear) {
            try {
                Thread.sleep(10);
                System.out.println("Je krijgt een paar milliseconden straf...");
                System.out.println("Je weet de Nanny te ontwijken en keert terug naar de kast");
                System.out.println("Je trapt tegen de kast...");
            } catch(InterruptedException ex){
                System.out.println("Je weet de Nanny te ontwijken en keert terug naar de kast");
            }
        }
        else{
        }
    }

    public static int getNannyMightHear() {
        return nannyMightHear;
    }
}
