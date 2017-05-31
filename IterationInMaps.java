package Collections_Frameworks;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IterationInMaps {

	public static void main(String[] args) {

		Map<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(6, "BMW");
		hash_map.put(4, "Audi");
		hash_map.put(8, "Mercedes");
		hash_map.put(2, "Jaguar");

		System.out.println("******************************************************************");
		System.out.println("Hash Map");
		System.out.println(hash_map);

		// Iteration 1. Using Entry methods
		System.out.println("Iteration 1 for Hash Map");
		for (Map.Entry<Integer, String> element : hash_map.entrySet()) {
			int key = element.getKey();
			String Value = element.getValue();
			System.out.println("The key is: " + key + " and the value is: "
					+ Value);
		}

		// Iteration 2. Using Key Sets
		System.out.println("Iteration 2 for Hash Map");
		for (Integer key : hash_map.keySet()) {
			String Value = hash_map.get(key);
			System.out.println("The key is: " + key + " and the value is: "
					+ Value);
		}
		
		System.out.println("******************************************************************");
		
		
		System.out.println("Linked Hash Map");
		Map<Integer, String> LH_map = new LinkedHashMap<Integer, String>();
		LH_map.put(2, "Dog");
		LH_map.put(8, "Cat");
		LH_map.put(6, "Rat");
		LH_map.put(4, "Bat");
		
		System.out.println(LH_map);

		// Iteration 1. Using Entry methods
		System.out.println("Iteration 1 for Linked Hash Map");
		for (Map.Entry<Integer, String> element : LH_map.entrySet()) {
			int key = element.getKey();
			String Value = element.getValue();
			System.out.println("The key is: " + key + " and the value is: "
					+ Value);
		}

		// Iteration 2. Using Key Sets
		System.out.println("Iteration 2 for Linked Hash Map");
		for (Integer key : LH_map.keySet()) {
			String Value = LH_map.get(key);
			System.out.println("The key is: " + key + " and the value is: "
					+ Value);
		}
		
		System.out.println("******************************************************************");

	//Same for Tree Map
	System.out.println("Tree Map");
	Map<Integer, String> tree_map = new TreeMap<Integer, String>();
	tree_map.put(2, "Dog");
	tree_map.put(8, "Cat");
	tree_map.put(6, "Bat");
	tree_map.put(4, "Rat");
	
	System.out.println(tree_map);

	// Iteration 1. Using Entry methods
	System.out.println("Iteration 1 for Tree Map");
	for (Map.Entry<Integer, String> element : tree_map.entrySet()) {
		int key = element.getKey();
		String Value = element.getValue();
		System.out.println("The key is: " + key + " and the value is: "
				+ Value);
	}

	// Iteration 2. Using Key Sets
	System.out.println("Iteration 2 for Tree Map");
	for (Integer key : tree_map.keySet()) {
		String Value = tree_map.get(key);
		System.out.println("The key is: " + key + " and the value is: "
				+ Value);
	}
	
	System.out.println("******************************************************************");
			}
}
