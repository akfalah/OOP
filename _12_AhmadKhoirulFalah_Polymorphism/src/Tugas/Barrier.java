package Tugas;

public class Barrier implements Destroyable {
    int strength;

    Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }


    @Override
    public void destroyed() {
        strength -= (int) (strength * 0.112);
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength + "\n";
    }
}
