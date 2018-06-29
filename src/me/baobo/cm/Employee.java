package me.baobo.cm;

public class Employee {
	public String name; // 员工姓名
	public long id; // 员工编号
	public static int ID = 1000; // 员工编号基数为1000

	Employee(String name) {
		this.name = name;
		ID++;
	}
}
