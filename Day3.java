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

		// Slope for 1,-1
		int counterB = 0;
		reader = new Scanner(supp);
		position = 0;
		while (reader.hasNextLine()) {
			if (reader.nextLine().charAt(position % 31) == '#') {
				counterB++;
			}
			position += 1;
		}
		// Slope for 5,-1
		int counterC = 0;
		reader = new Scanner(supp);
		position = 0;
		while (reader.hasNextLine()) {
			if (reader.nextLine().charAt(position % 31) == '#') {
				counterC++;
			}
			position += 5;
		}
		// Slope for 7,-1
		int counterD = 0;
		reader = new Scanner(supp);
		position = 0;
		while (reader.hasNextLine()) {
			if (reader.nextLine().charAt(position % 31) == '#') {
				counterD++;
			}
			position += 7;
		}
		// Slope for 1,-2
		int counterE = 0;
		reader = new Scanner(supp);
		position = 0;
		while (reader.hasNextLine()) {
			if (reader.nextLine().charAt(position % 31) == '#') {
				counterE++;
			}
			position += 1;
			if (reader.hasNextLine()) reader.nextLine();
		}
		System.out.println(counter * counterB * counterC * counterD *counterE);
	}
}