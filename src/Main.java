import java.util.Scanner;

public class Main {
	static int height;
	static String block;
	static final char SPACE = ' ';

	public static void main(String[] args) {
		System.out.println("Welcome to simple program, which will generate a christmas tree for you\n");
		System.out.print("Please select tree height: ");
		Scanner scan = new Scanner(System.in);
		height = scan.nextInt();
		do {
			System.out.println("Please choose a single character, which will be the building block");
			block = scan.next();
		} while (block.matches("\\.{1}"));
		generateTree();
	}
	
	private static void generateTree() {
		String line = "";
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height-(i+1); j++) {
				line += (char) 32;
			}
			for (int h = 0; h < (i == 0 ? 1 : i*2+1); h++) {
				line += block;
			}
			System.out.println(line);
			line = "";
		}
		System.out.println("\nMERRY CHRISTMASS M-FUCKER!");
	}
}
