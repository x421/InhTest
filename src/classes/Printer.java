package classes;

import abstracts.Device;

public class Printer extends Device {
    public Printer(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("Printer prints");
    }
}
