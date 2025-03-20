public class ElectronicDeviceFactory {
  public static ElectronicDeviceAbstractFactory getElectronicDeviceFactory(Segment segment) {
    switch (segment) {
      case MID_RANGE -> {
        return new MidRangeDeviceFactory();
      }
      case HIGH_END -> {
        return new HighEndDeviceFactory();
      }
      default -> throw new IllegalArgumentException("Invalid segment " + segment);
    }
  }
}
