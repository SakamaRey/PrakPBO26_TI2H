public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override 
    public void heal() {
        if (this.level == 1) {
            this.health += (this.health * 10 / 100);
        } else if (this.level == 2) {
            this.health += (this.health * 30 / 100);
        } else if (this.level == 3) {
            this.health += (this.health * 40 / 100);
        }
    }

    @Override 
    public void destroyed() {
        this.health -= (this.health * 20 / 100);
    }

    @Override 
    public String getZombieInfo() {
        return "Walking Zombie Data = \n" + super.getZombieInfo();
    }
}
