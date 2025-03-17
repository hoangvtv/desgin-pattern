public class Main {
  public static void main(String[] args) {
    Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
    System.out.println(hardCandy.getCandyName());

    System.out.println("==============================");

    Candy mintyCandy = CandyFactory.getCandy(CandyType.MINTY);
    System.out.println(mintyCandy.getCandyName());

    System.out.println("==============================");

    Candy nullCandy = CandyFactory.getCandy(CandyType.NULL);
    System.out.println(nullCandy.getCandyName());
  }
}