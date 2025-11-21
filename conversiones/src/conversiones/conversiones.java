package conversiones;

import java.util.Arrays;

public class conversiones {

	public static void main(String[] args) {
		
		String textoEntero="33";
		String textoConDecimales="33.56";
		int entero= 42;
		double conDecimales=44.67;
		
		//de char a String
		char c='a';
		String s=String.valueOf(c);
		
		//de char a entero
		String txtPin="231";
		for(int i=0;i<txtPin.length();i++) {
			int cifra=(int)txtPin.charAt(i)-48;
		}
		
		//de texto(String) a entero(int)
		int num1= Integer.parseInt(textoEntero);//convertimos texto a numero
		System.out.println(num1);

		//de texto(String) a decimales(doble)
		double num2=Double.parseDouble(textoConDecimales);//lo mismo que el anterior pero con Doubles
		System.out.println(num2);
		
		//de entero(int) a texot(String)
		String texto1=String.valueOf(entero);
		System.out.println(texto1);
		
		//de decimales(double) a texto(String)
		String texto2=String.valueOf(conDecimales);
		System.out.println(texto2);
		
		//entero(int) a decimales(double)
		double num3=(double)entero;
		
		//de decimales(double) a entero(int)
		//pero NO redondea
		int num4=(int)conDecimales;
		
		//para redondear
		int num5 =(int)Math.round(conDecimales);
		System.out.println(num5);
		
		//para redondear con solo 4 decimales
		final double pi=3.14159;
		double piRedondeado=(double)Math.round(pi*10000)/1000;
		//double piRedondeado2=Math.round(pi*10000)/1000.0; 
		//que divida entre un numero que sea decimal como en 
		//este caso 1000.0 para que decimales

		//para que devuelva el numero maximo
		int max=Math.max(539, 3);
		System.out.println(max);
		//para que duevla el minimo
		double mim=Math.min(539.4, 3);
		
		//para convertir un array a texto
		int diasDelMes[]= new int[12];
		String texto= Arrays.toString(diasDelMes);
	}
}
















