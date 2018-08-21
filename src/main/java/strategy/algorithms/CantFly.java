package strategy.algorithms;

import strategy.Fly;

// individual behavior (algorithm)
public class CantFly implements Fly {
    @Override
    public String flies() {
        return "Cannot fly";
    }
}
