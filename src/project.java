import java.util.Scanner;

public class project {

	private static Scanner scanner;

	public static void main(String[] args) {

		System.out.println("Как тебя зовут?");
		scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("Привет " + string);
	}

}
