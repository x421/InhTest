package main;

import classes.Cabinet;
import classes.Employee;
import classes.Office;
import classes.Scanner;

public class Main {

    public static void main(String[] args) {
	    Office office = new Office();

	    Cabinet cabinet314 = new Cabinet("314");

		cabinet314.setDevice(new Scanner("1", "2"));

		cabinet314.addEmployee(new Employee("1", "2"));
		cabinet314.addEmployee(new Employee("3", "4"));

		office.addCabinet(cabinet314);

		office.printOfficeInfo();
    }
}
