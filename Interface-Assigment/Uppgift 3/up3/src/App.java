import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<ElectronicDevice> devices = new ArrayList<>();
        devices.add(new Tv());
        devices.add(new Radio());

        for (ElectronicDevice device : devices) {
            device.turnOn();
            device.turnOff();
        }
    }
}
