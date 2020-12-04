import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
public class Day4{
	public static void main(String []args) throws FileNotFoundException {
		File supp = new File("supp4.txt");
		Scanner reader = new Scanner(supp);
		StringBuilder sb = new StringBuilder();
		int counter = 0;
		while (reader.hasNextLine()) {
			String nl = reader.nextLine();
			if (!nl.isEmpty()) {
				sb.append(nl + " ");
			} else {
				String rp = sb.toString();
				if (rp.contains("byr:") && rp.contains("iyr:") && rp.contains("eyr:") && rp.contains("hgt:") && rp.contains("hcl:") && rp.contains("ecl:") && rp.contains("pid:")) {
					counter++;
				}
				sb = new StringBuilder();
			}
		}
		System.out.println(counter);
	}
}