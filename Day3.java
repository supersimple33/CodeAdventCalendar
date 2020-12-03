import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Day3{
	public static void main(String []args) throws FileNotFoundException {
		File supp = new File("supp3.txt");
		Scanner reader = new Scanner(supp);
		int counter = 0;
		int position = 0;
		while (reader.hasNextLine()) {
			if (reader.nextLine().charAt(position % 31) == '#') {
				counter++;
			}
			position += 3;
		}
		System.out.println(counter);
	}
}