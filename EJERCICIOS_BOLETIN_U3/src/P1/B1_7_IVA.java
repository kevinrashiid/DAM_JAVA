package P1;

import java.util.Scanner;

public class B1_7_IVA {

	public static void main(String[] args) {

		// ===============EJERCICIO 7==============================
		// Escribir un programa que pida un número por teclado al usuario que simule ser
		// el precio de un artículo y escriba el resultado de aplicarle el IVA del 21%

		Scanner teclado = new Scanner(System.in);
		System.out.println("CALCULO EL 21% DE UN PRECIO");
		double articulo = teclado.nextInt();
		double iva;
		iva = articulo * 0.21;
		articulo = articulo - iva;
		System.out.println(articulo);

	}

}
