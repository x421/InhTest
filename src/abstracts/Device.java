/**
 * Базовый класс для устроства из кабинета.
 * @author x421
 * @version 1.0
 */

package abstracts;

public abstract class Device {
    protected DeviceStatus deviceCurrentStatus;
    protected String deviceName;
    protected String deviceUniqueID;

    public enum DeviceStatus {
        OFF,
        ON
    }

    public Device(String name, String id) {
        deviceUniqueID      = id;
        deviceName          = name;
        deviceCurrentStatus = DeviceStatus.OFF;
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
        deviceCurrentStatus = (deviceCurrentStatus == DeviceStatus.OFF) ? DeviceStatus.ON : DeviceStatus.OFF;
        System.out.println("Device name: " + deviceName + " id: " + deviceUniqueID + " status: " +
                ((deviceCurrentStatus == DeviceStatus.OFF) ? "not working" : "working"));
    }

}
