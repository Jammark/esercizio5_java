package esercizio1;

import java.util.Arrays;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		int[] lista = new int[5];
		for (int i = 0; i < 5; i++) {
			double val = Math.floor(Math.random() * 10 + 1);
			lista[i] = Double.valueOf(val).intValue();
		}
		log.info(Arrays.toString(lista));
		Scanner sc = new Scanner(System.in);
		int n = -1;
		try {
		do {
			log.info("inserire valore e posizione.");
			n = Integer.parseInt(sc.nextLine());
			int p = Integer.parseInt(sc.nextLine());
			if (p < 0 || p > 4) {
				log.warn("Posizione non corretta.");
				continue;
			} else {
				try {
				lista[p] = n;
				log.info(Arrays.toString(lista));
			} catch (ArrayIndexOutOfBoundsException e) {
				log.error(e.getMessage());
			}
			}
		} while (n != 0);
	} finally {
		sc.close();
	}

	}

}
