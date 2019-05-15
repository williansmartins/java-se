package com.williansmartins.c.colecoes;

import java.util.TreeMap;

public class MapasTreeMap {

	public static void main(String[] args) {
		TreeMap vehicles = new TreeMap();

		// Add some vehicles.
		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);

		System.out.println("Total vehicles: " + vehicles.size());

		// Iterate over all vehicles, using the keySet method.
		for (Object key : vehicles.keySet())
			System.out.println(key + " - " + vehicles.get((String) key));
		System.out.println();

		System.out.println("Highest key: " + vehicles.lastKey());
		System.out.println("Lowest key: " + vehicles.firstKey());

		System.out.println("\nPrinting all values:");
		for (Object val : vehicles.values())
			System.out.println((Integer) val);
		System.out.println();

		// Clear all values.
		vehicles.clear();

		// Equals to zero.
		System.out.println("After clear operation, size: " + vehicles.size());

	}
}