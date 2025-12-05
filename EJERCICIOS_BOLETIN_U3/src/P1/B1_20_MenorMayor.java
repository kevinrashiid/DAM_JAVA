package P1;

import java.util.Scanner;

public class B1_20_MenorMayor {

	public static void main(String[] args) {
		//===============EJERCICIO 20==============================
		//Escribir un programa que nos pida tres números por teclado en cualquier orden y nos los
		//muestre en pantalla ordenados de menor a mayor
		//EXPLICACION DEL CODIGO
		//PEDIMOS NUMEROS HASTA LA LINEA 458
		Scanner teclado=new Scanner(System.in);
		System.out.println("NUMERO 1--> ");
		int num1=teclado.nextInt();
		System.out.println("NUMERO 2--> ");
		int num2=teclado.nextInt();
		System.out.println("NUMERO 3--> ");
		int num3=teclado.nextInt();
		//COMPARAMOS PARA SABER CUAL ES MAXIMO DE LOS 3 NUMEROS PEDIDOS Y LO ALMACENAMOS EN MAX
		//COMPAREMOS num1 Y num2 EL QUE SEA MAYOR SE VUELVE A COMPARAR CON NUM3
		int max=Math.max(Math.max(num1, num2),num3);
		//AQUI LO MISMO QUE ANTES PERO CON EL MINIMO
		int min=Math.min(Math.min(num1, num2), num3);
		//CON EL ANTERIOR CODIGO TENEMOS EL MAYOR Y EL MENOR PERO CON LA SIGUIENTE LINEA SACAMOS
		//EL DEL MEDIO
		//SUMAMOS LOS NUMEROS PEDIDOS, SUMAMOS EL MAXIMO Y EL MINIMO Y LOS RESTAMOS CON LA SUMA DE LOS
		//NUMEROS, EL RESULTADO ES EL NUMERO QUE QUEDA QUE ES EL DEL MEDIO POR QUE LE HEMOS RESTADO EL 
		//MAXIMO Y EL MINIMO
		int medio=(num1+num2+num3)-(max+min);
		//EJEMPLO: NUM1-->2 NUM2-->3 NUM3-->4 LOS SUMAMOS = 9 LES RESTAMOS EL MAXIMO Y EL MINIMO 
		//=(2+3+4) - (2+4)=3 EL DEL MEDIO
		System.out.println("EL MAYOR ---> "+max);
		System.out.println("EL DEL MEDIO ---> "+medio);
		System.out.println("EL MINIMO ---> "+min);
	}
}
