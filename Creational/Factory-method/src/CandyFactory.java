public class CandyFactory {
  public static Candy getCandy(CandyType candyType) {
    return switch (candyType) {
      case MINTY -> new MintyCandy();
      case HARD -> new HardCandy();
      default -> throw new IllegalArgumentException("This candy type is unsupported");
    };
  }
}
