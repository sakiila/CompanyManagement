package me.baobo.cm;

public class Manager extends Employee {
	private double salary = 8000; // 经理的固定工资

	Manager(String name) {
		super(name);
		id = ID;
	}

	public double getPay() {
		return salary;
	}

	public String toString() {
		return name + " " + id + " " + getPay();
	}
}
