package com.capgemini.array;

public class TestA {
	public static void main(String[] args) {
		Employee[] t = new Employee[4];
		Employee t1 = new Employee(101, "nayanthara", 90.49);
		Employee t2 = new Employee(101, "sridiviya", 91.50);
		Employee t3 = new Employee(101, "samantha", 34.49);
		Employee t4 = new Employee(101, "trisha", 95.49);

		t[0] = t1;
		t[1] = t2;
		t[2] = t3;
		t[3] = t4;

		printTestfDetails(t);
		Employee q[] = getTestF();
		printTestfDetails(q);
	}

	public static void printTestfDetails(Employee[] a) {
		for (int i = 0; i <= a.length; i++) {
			System.out.println("name-" + a[i].name);
			System.out.println("id-" + a[i].id);
			System.out.println("perc-" + a[i].sal);

		}
	}

	static Employee[] getTestF() {
		Employee[] t = new Employee[5];
		Employee t1 = new Employee(101, "praba", 90.49);
		Employee t2 = new Employee(101, "prathap", 91.50);
		Employee t3 = new Employee(101, "sneks", 34.49);
		Employee t4 = new Employee(101, "rubs", 95.49);

		t[0] = t1;
		t[1] = t2;
		t[2] = t3;
		t[3] = t4;
		return t;
	}
}
