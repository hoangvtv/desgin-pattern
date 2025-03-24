public interface Builder {
  Builder buildRoof(boolean hasRoof);
  Builder buildPool(boolean hasPool);
  Builder buildWalls(int walls);
  Builder buildDoor(int doors);
  Builder buildColor(String color);
  House build();

}
