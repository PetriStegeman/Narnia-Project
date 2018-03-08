package narnia.kast;

import static narnia.kast.Kast.kastBuilder;
import static narnia.kast.Nanny.getNannyMightHear;
import static narnia.kast.Nanny.nannyApproaches;
import static narnia.kast.Persoon.kickStrength;
import static narnia.kast.Materiaal.*;

public class Narnia {

    public static void main(String[] args) {

        Aslan deOneAslan = new Aslan(false);
        Kast mijnKast = kastBuilder();

        do {

            System.out.println("Voor je staat een grote kast van " + mijnKast.getMateriaal());

            System.out.println("Je trapt tegen de kast...");

            Persoon mijnPersoon = kickStrength();

            Nanny mijnNanny = nannyApproaches(getNannyMightHear());

            mijnNanny.nannyPunishment(mijnNanny);

            mijnKast.schopTegenKast(mijnPersoon);

            if (!mijnKast.isKastKapot()){
                mijnPersoon.findNarnia(mijnKast);

            }else {
                mijnKast = kastBuilder();
                System.out.println("Je gaat op zoek naar een nieuwe kast...");
                continue;
            }

            Witch badWitch = new Witch(false);

            if (mijnKast.isHasNarnia()){
                mijnPersoon.fightTheWitch(badWitch);
            }
            else {
            }

            if (badWitch.isWitchDefeated()){
                System.out.println("Het is je gelukt! De slechte Heks is verslaan!");
                System.out.println("Plotseling wordt je verblind door zonlicht; alleen silhoutte aan de horizon");
                System.out.println("Je staat eindelijk voor de glorieuze Aslan. Je zoektocht is ten einde");
                deOneAslan.setMetAslan(true);
            }
            else{
                System.out.println("Het is tijd om je zoektocht opnieuw te beginnen...");
            }

        }while (!deOneAslan.isMetAslan());
    }


}
