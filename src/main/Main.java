package main;

import classes.Cabinet;
import classes.Employee;
import classes.Office;
import classes.Scanner;

public class Main {

    public static void main(String[] args) {
	    Office of = new Office();
	    Cabinet c = new Cabinet("314");
	    c.setDevice(new Scanner("1", "2"));
	    c.addEmployee(new Employee("1", "2"));
        c.addEmployee(new Employee("3", "4"));
	    of.addCabinet(c);

	    of.printOfficeInfo();
    }
}
