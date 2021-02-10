package conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// Set<String> set = new HashSet<>();
		// Set<String> set = new LinkedHashSet<>();
		Set<String> set = new TreeSet<>();

		set.add("A4");
		set.add("B6");
		set.add("D8");
		set.add("E9");
		set.add("C7");
		set.add("F3");
		set.add("G2");
		set.add("G2");

		for (String s : set) {
			System.out.println(s);
		}
	}

}
