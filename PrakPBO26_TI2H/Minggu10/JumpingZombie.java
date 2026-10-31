public class JumpingZombie extends Zombie {
    
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override 
    public void heal() {
        if (this.level == 1) {
            this.health += (this.health * 30 / 100);
        } else if (this.level == 2) {
            this.health += (this.health * 40 / 100);
        } else if (this.level == 3) {
            this.health += (this.health * 50 / 100);
        }
    }

    @Override 
    public void destroyed() {
        this.health -= (this.health * 10 / 100);
    }

    @Override 
    public String getZombieInfo() {
        return "Jumping Zombie Data = \n" + super.getZombieInfo();
    }
}
