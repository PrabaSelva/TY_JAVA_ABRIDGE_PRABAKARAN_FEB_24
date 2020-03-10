package com.capgemini.array;

public class TestB {
	public static void main(String[] args) {
		Item[] i = new Item[4];
		Item i1 = new Item("kitkat", 30, "march2020");
		Item i2 = new Item("Fivestar", 10, "may2020");
		Item i3 = new Item("diarymilk", 5, "april2020");
		i[0] = i1;
		i[1] = i2;
		i[3] = i3;
		printTestfDetails(i);
		Item q[] = getTestF();
		printTestfDetails(q);
	}

	public static Item[] getTestF() {
		Item[] i = new Item[4];
		Item i1 = new Item("kitkat", 30, "march2020");
		Item i2 = new Item("Fivestar", 10, "may2020");
		Item i3 = new Item("diarymilk", 5, "april2020");
		i[0] = i1;
		i[1] = i2;
		i[3] = i3;
		return i;
	}

	public static void printTestfDetails(Item[] a) {
		for (int i = 0; i <= a.length; i++) {
			System.out.println("name-" + a[i].name);
			System.out.println("id-" + a[i].price);
			System.out.println("perc-" + a[i].expdate);
		}
	}
}
