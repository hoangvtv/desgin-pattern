public class LazyInitialization {
  private static LazyInitialization instance;

  private LazyInitialization() {}
  public static LazyInitialization getInstance() {
    if(instance == null) {
      instance = new LazyInitialization();
    }
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
