package Tugas;

public class JumpingZombie extends Zombie{
    JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (int) (health * 0.3);
        } else if (level == 2) {
            health += (int) (health * 0.4);
        } else if (level == 3) {
            health += (int) (health * 0.5);
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (health * 0.1);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = \n" + super.getZombieInfo();
    }
}
