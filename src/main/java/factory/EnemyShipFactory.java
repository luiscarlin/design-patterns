package factory;

import factory.enemyships.BigUfoShip;
import factory.enemyships.RocketShip;
import factory.enemyships.UfoShip;

// will get you an enemy ship based on a character
public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String type) {
        EnemyShip enemyShip = null;

        if (type.equalsIgnoreCase("u")) {
            enemyShip = new UfoShip();
        }
        else if (type.equalsIgnoreCase("b")) {
            enemyShip = new BigUfoShip();
        }
        else if (type.equalsIgnoreCase("r")) {
            enemyShip = new RocketShip();
        }

        return enemyShip;
    }
}
