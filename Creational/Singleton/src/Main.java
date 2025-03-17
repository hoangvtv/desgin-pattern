public class Main {
  public static void main(String[] args) {
    //EagerInitialization
    EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
    eagerInitialization1.setName("EagerInitialization1");


    EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();

    System.out.println("eagerInitialization1 = " + eagerInitialization1.getName());
    System.out.println("eagerInitialization2 = " + eagerInitialization2.getName());

    //LazyInitialization
    LazyInitialization lazyInitialization1 = LazyInitialization.getInstance();
    lazyInitialization1.setName("LazyInitialization1");

    LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();

    System.out.println("lazyInitialization1 = " + lazyInitialization1.getName());
    System.out.println("lazyInitialization2 = " + lazyInitialization2.getName());

  }
}