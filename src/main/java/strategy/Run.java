package strategy;

import strategy.algorithms.CanFly;

public class Run {
    public static void main(String[] args) {

        Animal myCat = new Cat();
        Animal myBird = new Bird();

        System.out.println("Flying for cat: " + myCat.getFlying().flies());

        System.out.println("Flying for bird: " + myBird.getFlying().flies());

        System.out.println("cat now has wings!!");

        myCat.setFlying(new CanFly());

        System.out.println("Now flying for cat: " + myCat.getFlying().flies());
    }
}
