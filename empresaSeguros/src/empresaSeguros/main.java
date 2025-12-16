package empresaSeguros;

public class main {

	public static void main(String[] args) {

		conductor kevin=new conductor("51553933f", 4, 2000,2027);
		conductor ale=new conductor("24543933f", 8, 2003,2027);

		
		System.out.println(kevin.antiguedad());

		motos kawasaky=new motos("44444mb",2005,kevin);
		coches laFerrari=new coches("1", 2010, ale);
		
		System.out.println(kevin.edad());
	}
}
