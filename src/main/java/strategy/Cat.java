package strategy;

import strategy.algorithms.CantFly;

public class Cat extends Animal {
    public Cat() {
        super();
        setName("super cat");
        setWeight(7);

        // specify the algorithm
        setFlying(new CantFly());
    }
}
