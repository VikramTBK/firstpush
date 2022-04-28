package Practice;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

	public static void main(String[] args) {

		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "Alpha");
		mp.put(2, "Beta");
		mp.put(3, "Gama");

		System.out.println("Iterating HashMap...");
		for (Map.Entry m : mp.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

	}

}
