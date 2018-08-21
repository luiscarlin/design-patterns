package strategy;

public class Animal {
    private String name;
    private int weight;

    // interchangeable behavior (algorithm)
    private Fly flying;


    public Fly getFlying() {
        return flying;
    }

    public void setFlying(Fly flying) {
        this.flying = flying;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
