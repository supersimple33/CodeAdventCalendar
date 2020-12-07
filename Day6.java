import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
public class Day6{
	public static void main(String []args) throws FileNotFoundException {
		File supp = new File("supp6.txt");
		Scanner reader = new Scanner(supp);
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		while (reader.hasNextLine()) {
			String nl = reader.nextLine();
			if (!nl.isEmpty()) {
				sb.append(nl);
			} else {
				Character[] chars = new Character[sb.length()];
				for (int i = 0; i < sb.length(); i++) {
					chars[i] = sb.charAt(i);
				}
				LinkedHashSet<Character> lset = new LinkedHashSet<Character>(Arrays.asList(chars));
				sum += lset.size();
				sb = new StringBuilder();
			}
		}
		System.out.println(sum);
		
		sum = 0;
		reader = new Scanner(supp);
		boolean group = true;
		sb = new StringBuilder();
		while (reader.hasNextLine()) {
			String nl = reader.nextLine();
			if (group) {
				sb.append(nl);
				group = false;
			} else  if (!nl.isEmpty()) {
				for (int i = 0; i < sb.length(); i++) {
					if (!nl.contains(sb.charAt(i) + "")) {
						sb.deleteCharAt(i);
						i--;
					}
				}
				group = false;
			} else {
				sum += sb.length();
				sb = new StringBuilder();
				group = true;
			}
			
		}
		System.out.println(sum);
	}
}