/**
 * Класс кабинета, включает в себя одно устройство
 * и множество сотрудников
 * @author x421
 * @version 1.0
 */

package classes;

import abstracts.Device;

import java.util.ArrayList;

public class Cabinet {
    private Device cabinetDevice;
    private ArrayList<Employee> employeeList;
    private String cabinetUniqueID;

    public Cabinet(String cabinetID) {
        cabinetUniqueID = cabinetID;
        employeeList    = new ArrayList<>();
    }

    public void setDevice(Device dev) {
        this.cabinetDevice = dev;
    }

    public void addEmployee(Employee p) {
        employeeList.add(p);
    }


    public void printCabinetInfo() {
        System.out.println("Cabinet id: " + cabinetUniqueID +
                ".\nDevice is: " + cabinetDevice.getDeviceName() + "," +
                " id: " + cabinetDevice.getDeviceID() + ", status: " +
                cabinetDevice.getDeviceCurrentStatus() + ". Employee list: ");

        for(int end = employeeList.size(), i = 0; i < end; i++) {
            employeeList.get(i).printEmployeeInfo();
        }
    }

}
