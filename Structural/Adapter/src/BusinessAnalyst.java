public class BusinessAnalyst implements Customer {

  private Developer developer;

  public BusinessAnalyst(Developer developer) {
    this.developer = developer;
  }

  @Override
  public void sendRequest(String request) {
    System.out.println("Reading request: ... ");
    System.out.println(request);

    String message = this.translate(request);
    System.out.println("Send info...");
    developer.receive(message);
  }

  private String translate(String request) {
    return "Create Zoom";
  }
}
