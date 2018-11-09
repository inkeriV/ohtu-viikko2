package main;
import java.util.*;
import ohtu.Multiplier;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Harooo :-----D");
		/*System.out.println("dare?");
		String nimi = scanner.nextLine();
		System.out.println("okk " + nimi + ", ureshii");
		System.out.println("lmaoo am weeb");*/
		System.out.println();

		Multiplier kaka = new Multiplier(3);
		System.out.println("anna luku ");
		int luku = scanner.nextInt();

		System.out.println("luku kertaa kolme on "+kaka.multipliedBy(luku) );

	}
}
