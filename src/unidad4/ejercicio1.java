package unidad4;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String cadena;
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;

		System.out.println("Introducir cadena: ");
		cadena = teclado.nextLine().toLowerCase();

		for (int j = 0; j < cadena.length(); j++) {
			char c = cadena.charAt(j);

			switch (c) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			}
		}
		System.out.println("a:" + a);
		System.out.println("e:" + e);
		System.out.println("i:" + i);
		System.out.println("o:" + o);
		System.out.println("u:" + u);

		teclado.close();
	}

}
