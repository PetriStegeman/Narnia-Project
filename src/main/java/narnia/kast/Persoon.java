package narnia.kast;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.concurrent.ThreadLocalRandom;

public class Persoon {

    private int power;
    private static int experience = 0;

    public static Persoon kickStrength(){
        int randomPower = ThreadLocalRandom.current().nextInt(1, 9 + 1);
        return new Persoon(randomPower);
    }

    public void findNarnia(Kast mijnKast){
        int randomNarnia = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        if(randomNarnia == 1){
            System.out.println("Je hebt Narnia ontdekt!");
            mijnKast.setHasNarnia(true);
        }
        else{
            System.out.println("Deze kast heeft helaas geen doorgang naar Naria...");
        }

    }
    public void fightTheWitch(Witch badWitch){
    int randomNarnia = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        System.out.println("Je hebt nog maar een paar stappen gezet voor de Heks ineens voor je staat!");
        System.out.println("Je valt de heks aan...");

       if(getExperience() > randomNarnia) {
           System.out.println("Je hebt de heks verslagen!");
           badWitch.setWitchDefeated(true);
       }
       else{
           setExperience(getExperience()+ 1);
           System.out.println("Je bent door de heks verslagen");
           System.out.println("Je totale experience is nu " + getExperience());
           System.out.println("Je wordt ploteseling wakker in je eigen kamer");
       }
    }

    public Persoon(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public static int getExperience() {
        return experience;
    }

    public static void setExperience(int experience) {
        Persoon.experience = experience;
    }
}
