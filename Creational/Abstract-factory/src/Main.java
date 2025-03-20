public class Main {
  public static void main(String[] args) {
    ElectronicDeviceAbstractFactory highEndFactory
        = ElectronicDeviceFactory.getElectronicDeviceFactory(Segment.HIGH_END);

    Laptop highEndLaptop = highEndFactory.getLaptop();
    Phone highEndPhone = highEndFactory.getPhone();

    System.out.println("highEndLaptop: " + highEndLaptop.getSegment());
    System.out.println("highEndPhone: " + highEndPhone.getSegment());

    System.out.println("========================================");

    ElectronicDeviceAbstractFactory midRangeFactory
        = ElectronicDeviceFactory.getElectronicDeviceFactory(Segment.MID_RANGE);

    Laptop midRangeLaptop = midRangeFactory.getLaptop();
    Phone midRangePhone = midRangeFactory.getPhone();

    System.out.println("midRangeLaptop: " + midRangeLaptop.getSegment());
    System.out.println("midRangePhone: " + midRangePhone.getSegment());
  }
}