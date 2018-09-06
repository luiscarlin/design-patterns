package abstract_factory;


// takes orders for ships. They have weapon, engine, and name (types depends on the ship)
public abstract class EnemyShipBuilding {

    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();

        return theEnemyShip;
    }
}
