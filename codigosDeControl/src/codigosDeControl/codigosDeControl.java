package codigosDeControl;

import java.util.Scanner;

public class codigosDeControl {

	public static void main(String[] args) {
		//················SALIDAS POR PANTALLA···························
				System.out.println("Esto va en una linea\nY esto en la de abajo");
				String nombre ="jose maria";
				String apellido="morales vazques";
				int edad=27;
				double salario=1345.678;
				String miNombre="kevin";
				String miApellido="villarroel";
		//#######codigos de control#################
				//LA LETRA ES EL TIPO DE VARIABLE
				//.printf
				//%s = string
				//%d = decimal
				//%f = numeros con decimales
				//.2 para REDONDEAR A DOS DECIMALES SI ELLA SALE SON DOS DECIMALES
				System.out.printf("tu nombre es %s apellido %s ,"
						+ " tienes %d y cobras %.2f euros",nombre,apellido,edad,salario);
				
				//PRACTICANDO
				System.out.printf("alineando texto: \n%10s\n%10s\n",miNombre,miApellido);
				
				//PROGRAMA DE CONTABILIDAD
				int n1 =345;
				int n2=1245;
				int n3=2;
				int n4=32;
				
				//el 5 para que ordene en columnas y las unidades con las unidades etc es decir alinear a la derecha
				//el 5 es el numero que 
				System.out.printf("Ingresos:\n%5d€\n%5d€\n%5d€\n%5d€\n", n1, n2, n3, n4);
				// para que alinee a la izquierda
				System.out.printf("Ingresos:\n%-5d€\n%-5d€\n%-5d€\n%-5d€\n", n1, n2, n3, n4);
				// para que RELLENAR a la izquierda 0
				System.out.printf("Ingresos:\n%05d€\n%05d€\n%05d€\n%05d€\n", n1, n2, n3, n4);

				double d1 = 345.12;
				double d2 = -1245.1;
				double d3 = 2.9;
				double d4 = 32.3456;
				// para alinear en base a la coma
				//el signo - tambien cuenta por eso es %9 si no el d2 se descuadra
				System.out.printf("Ingresos:\n%9.3f€ \n%9.3f€ \n%9.3f€ \n%9.3f€ \n", d1, d2, d3, d4);
				
				//si el numero es positivo te lo pone si es negativo te pone - (tambien cuanta como caracter)
				System.out.printf("Ingresos:\n%+9.3f€ \n%+9.3f€ \n%+9.3f€ \n%+9.3f€ \n", d1, d2, d3, d4);
				//si queremos hacer que los negativos salgan entre parentesis
				System.out.printf("Ingresos:\n%(9.3f€ \n%(9.3f€ \n%(9.3f€ \n%(9.3f€ \n", d1, d2, d3, d4);
				
				//para que salga la salida de color rojo 
				System.err.printf("Ingresos:\n%(9.3f€ \n%(9.3f€ \n%(9.3f€ \n%(9.3f€ \n", d1, d2, d3, d4);
				
				//EJERCICIO QUE TE PIDA POR TECLADO LAS CIFRAS Y LOS DECIMALES Y QUE IMPIRMA SEGUN
				//LO QUE LE HAS PASADO
				Scanner teclado=new Scanner(System.in);
				System.out.println("cuantas cifras totales quieres que tenga? ");
				String cifras=teclado.nextLine();
				System.out.println("cuantas cifras decimales quieres que tenga? ");
				String decimales=teclado.nextLine();
				
				double c1=233.3;
				double e=2.71828;
				
				//introducimos el formato en una variable
				String formato="%"+cifras+"."+decimales+"f";
				System.out.println(formato);
				formato=formato+"\n"+formato;//para ir saltar de linea

				System.out.printf(formato,c1,e);
				
				//con esto nos podemos ahorrar un varible pero no lo guardamos en una variable
				//System.out.printf("%"+cifras+"."+decimales+"f",c1,e);
	}
}
