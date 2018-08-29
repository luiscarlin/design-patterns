package factory;

// cannot be instantiated, but can be inherited from
public abstract class EnemyShip {

    private String name;
    private double speed;

    public void followHeroShip() {
        System.out.println(getName() + " - following hero ship");
    }

    public void shootHeroShip() {
        System.out.println(getName() + " - shooting hero ship");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " - shows up at " + getSpeed() + " speed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
