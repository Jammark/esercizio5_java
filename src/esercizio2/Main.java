package esercizio2;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			log.info("Inserire km");
			int km = Integer.parseInt(sc.nextLine());
			log.info("Inserire litri");
			int l = Integer.parseInt(sc.nextLine());
			double val = km / l;
			log.info("km per litro: " + String.format("%.2f", val));
		} catch (ArithmeticException e) {
			log.error(e.getMessage());
		}

	}

}
