package narnia.kast;

public class Witch {

    private boolean isWitchDefeated;

    public Witch(boolean isWitchDefeated) {
        this.isWitchDefeated = isWitchDefeated;
    }

    public boolean isWitchDefeated() {
        return isWitchDefeated;
    }

    public void setWitchDefeated(boolean witchDefeated) {
        isWitchDefeated = witchDefeated;
    }
}
