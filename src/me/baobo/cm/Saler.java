package me.baobo.cm;

public class Saler extends Employee {
	private double salesNum; // 销售人员的销售额

	Saler(String name, long salesNum) {
		super(name);
		id = ID;
		this.salesNum = salesNum;
	}

	public double getPay() {
		 return salesNum*0.04;
//		return Math.round(salesNum * 0.04); // 调用Math.round()进行四舍五入
	}

	public String toString() {
		return name + " " + id + " " + getPay();
	}
}
