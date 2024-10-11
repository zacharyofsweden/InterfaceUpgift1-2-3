public class Radio implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Radio is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is now OFF");
    }
}
