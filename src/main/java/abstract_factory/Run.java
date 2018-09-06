package abstract_factory;


public class Run {
    public static void main(String[] args) {
        // knows how to handle orders for new Enemy ships
        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        // You order (with a string) what you want it to create. It will return the EnemyShip
        EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");
    }
}
