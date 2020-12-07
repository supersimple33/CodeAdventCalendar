import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
public class Day5{
	public static void main(String []args) throws FileNotFoundException {
		File supp = new File("supp5.txt");
		Scanner reader = new Scanner(supp);
		ArrayList<Integer> seats = new ArrayList<Integer>();
		while (reader.hasNextLine()) {
			String nl = reader.nextLine();
			int row = 64;
			for (int i = 0; i < 7; i++) {
				char c = nl.charAt(i);
				int sign = (c == 'F') ? -1 : 1;
				row += Math.pow(2.0, 5.0 - i) * sign;
			}
			int col = 4;
			for (int i = 7; i < 10; i++) {
				char c = nl.charAt(i);
				int sign = (c == 'L') ? -1 : 1;
				col += Math.pow(2.0, 8.0 - i) * sign;
			}
			seats.add(row * 8 + col);
		}
		System.out.println(Collections.max(seats));
		Collections.sort(seats);
		for (int i = 1; i < seats.size(); i++) {
			if (seats.get(i) - seats.get(i - 1) != 1) {
				System.out.println(seats.get(i) - 1);
			}
		}
	}
}