package strategy;

import strategy.algorithms.CanFly;

public class Bird extends Animal {
    public Bird() {
        super();
        setName("birdie");
        setWeight(5);

        // specify the behavior
        setFlying(new CanFly());
    }
}
