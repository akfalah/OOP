package Tugas;

public class WalkingZombie extends Zombie{
    WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (int) (health * 0.1);
        } else if (level == 2) {
            health += (int) (health * 0.3);
        } else if (level == 3) {
            health += (int) (health * 0.4);
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (health * 0.2);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = \n" + super.getZombieInfo();
    }
}
