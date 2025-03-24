public class Main {
  public static void main(String[] args) {
    House house1 = new HouseBuilder()
        .buildDoor(5)
        .buildRoof(true)
        .buildPool(true)
        .buildWalls(4)
        .buildColor("red")
        .build();
    System.out.println(house1);
  }
}