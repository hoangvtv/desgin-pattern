public class Main {
  public static void main(String[] args) {
    User user1 = new User("test", "test@gmail.com", 39);
//    User user2 = user1;
    User user2 = user1.clone();

    System.out.println(user1);
    System.out.println("================");
    System.out.println(user2);
    System.out.println("================");
    user1.setAge(23);
    System.out.println(user1);
    System.out.println("================");
    System.out.println(user2);
  }
}