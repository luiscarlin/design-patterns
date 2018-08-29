package factory;

import java.util.Random;

public class Run {

    private final static String[] ENEMY_TYPES = {"u", "r", "b"};

    public static void main(String[] args) {
        spawnNewEnemy();
        spawnNewEnemy();
        spawnNewEnemy();
        spawnNewEnemy();
        spawnNewEnemy();
    }

    private static void spawnNewEnemy() {
        String type = getRandomEnemyType();

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip enemyShip = shipFactory.makeEnemyShip(type);
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.shootHeroShip();
    }

    private static String getRandomEnemyType() {
        Random random = new Random();
        int randomIndex = random.nextInt(ENEMY_TYPES.length);
        return ENEMY_TYPES[randomIndex];
    }
}
