import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Day1{
	 public static void main(String []args) throws FileNotFoundException {
		System.out.println(new File(".").getAbsolutePath());
		File supp = new File("supp1.txt");
		Scanner reader = new Scanner(supp);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (reader.hasNextLine()) {
			arr.add(Integer.parseInt(reader.nextLine()));
		}

		for (int i = 0; i < arr.size(); i++){
			for (int j = 0; j < i; j++) {
				if (arr.get(i) + arr.get(j) == 2020) {
					 System.out.println(arr.get(i) * arr.get(j));
				}
			}
		}
		for (int i = 0; i < arr.size(); i++){
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < j; k++) {
					if (arr.get(i) + arr.get(j) + arr.get(k) == 2020) {
						System.out.println(arr.get(i) * arr.get(j) * arr.get(k));
					}
				}
			}
		}
	 }
}