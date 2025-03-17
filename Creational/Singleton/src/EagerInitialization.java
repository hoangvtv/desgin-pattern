public class EagerInitialization {
  private static final EagerInitialization instance = new EagerInitialization();
  private EagerInitialization() {}
  public static EagerInitialization getInstance() {
    return instance;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
