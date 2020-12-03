import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Day2{
	public static void main(String []args) throws FileNotFoundException {
		File supp = new File("supp2.txt");
		Scanner reader = new Scanner(supp);
		int counter = 0;
		while (reader.hasNextLine()) {
			String str = reader.nextLine();
			// System.out.println(str);
			int min = Integer.parseInt(str.split("[- :]+")[0]) + 1;
			int max = Integer.parseInt(str.split("[- :]+")[1]) + 1;
			String ch = str.split("[- :]+")[2];
			String pass = str.split("[- :]+")[3].replaceAll(".", "$0 ");
			if ((pass.split(ch).length <= max) && (pass.split(ch).length >= min)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}