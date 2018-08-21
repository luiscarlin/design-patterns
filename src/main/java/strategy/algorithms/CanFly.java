package strategy.algorithms;

import strategy.Fly;

// individual behavior (algorithm)
public class CanFly implements Fly {

    @Override
    public String flies() {
        return "Flying High";
    }
}
