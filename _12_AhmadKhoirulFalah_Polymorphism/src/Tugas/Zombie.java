package Tugas;

public class Zombie implements Destroyable {
    int health;
    int level;

    public void heal() {

    }

    @Override
    public void destroyed() {

    }

    public String getZombieInfo() {
        return "Health = " + health + "\n" + "Level = " + level + "\n";
    }
}
