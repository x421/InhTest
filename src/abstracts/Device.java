package abstracts;

public abstract class Device {
    protected Boolean deviceCurrentStatus;
    protected String deviceName;
    protected String deviceUniqueID;

    public Device(String name, String id) {
        deviceUniqueID      = id;
        deviceName          = name;
        deviceCurrentStatus = false;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getDeviceID() {
        return deviceUniqueID;
    }

    public String getDeviceCurrentStatus() {
        return deviceUniqueID;
    }

    public abstract void work();

    public void changeDeviceStatus() {
        deviceCurrentStatus = !deviceCurrentStatus;
        System.out.println("Device name: " + deviceName + " id: " + deviceUniqueID + " status: " + deviceCurrentStatus);
    }

}
