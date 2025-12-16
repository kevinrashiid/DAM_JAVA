package empresaSeguros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class conductor {
	private String nif;
	private int pCarnet;
	private int añoNacimiento;
	private int añoCarnet;
	
	public conductor(String nif,int pCarnet, int añoNacimiento,int añoCarnet) {
		this.nif=nif;
		this.pCarnet=pCarnet;
		this.añoNacimiento=añoNacimiento;
		this.añoCarnet=añoCarnet;
	}
	
	//CALCULANDO LA EDAD SEGUN SOLO EL AÑO
	public int edad() {
		int nacimiento=this.añoNacimiento;//almacenamos el año segun
		LocalDate hoy=LocalDate.now();		
		DateTimeFormatter formato1= DateTimeFormatter.ofPattern("yyyy");
		String fechaConFormato=hoy.format(formato1);
		int convertido=Integer.parseInt(fechaConFormato);
		int edad=convertido-nacimiento;
		return edad;
	}
	
	//ANTIGUEDAD DEL CONDUCTOR
	public int antiguedad() {
		int antiguedad=0;
		LocalDate hoy=LocalDate.now();		
		DateTimeFormatter formato1= DateTimeFormatter.ofPattern("yyyy");
		String fechaConFormato=hoy.format(formato1);
		
		int convertido=Integer.parseInt(fechaConFormato);
		antiguedad=añoCarnet-convertido;
		return antiguedad;
	}
	
	public int getpCarnet() {
		return pCarnet;
	}
	public void setpCarnet(int pCarnet) {
		this.pCarnet = pCarnet;
	}




}
