import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Day7{
	public static int open(String tbp, Hashtable<String, List<String>> rules) {
		List<String> chop = rules.get(tbp);
		if (chop.contains("shiny gold bag")) {
			return 1;
		} else {
			for (String bag : chop) {
				if (!rules.containsKey(bag)) {
					continue;
				}
				if (open(bag, rules) == 1) {
					return 1;
				}
			}
		}
		return 0;
	}
	public static void main(String []args) throws FileNotFoundException {
		File supp = new File("supp7.txt");
		Scanner reader = new Scanner(supp);
		Hashtable<String, List<String>> rules = new Hashtable<String, List<String>>();
		while (reader.hasNextLine()) {
			String nl = reader.nextLine().replaceAll("[.]", ", 0 ");
			String[] strs = nl.split(" contain ");
			String ob = strs[0].substring(0, strs[0].length() - 1);
			strs = (", " + strs[1]).split("[s]?, [0-9] ");
			List<String> chop = Arrays.asList( Arrays.copyOfRange(strs, 1, strs.length) );
			rules.put(ob, chop);
		}
		System.out.println(rules);
		LinkedHashSet<String> counter = new LinkedHashSet<String>();
		for (Map.Entry<String, List<String>> entry : rules.entrySet()) {
			List<String> chop = entry.getValue();
			if (chop.contains("shiny gold bag")) {
				counter.add(entry.getKey());
			} else {
				for (String bag : chop) {
					if (rules.containsKey(bag)) {
						int L = open(bag, rules);
						if (L == 1) {
							counter.add(entry.getKey());
						}
					}
				}
			}
		}
		System.out.println(counter.size());
	}
}