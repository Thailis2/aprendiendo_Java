
public class ejemploCaracteres {
	public static void main(String[] args) {
		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 65;
		System.out.println(caracter);
		
		caracter = 65 + 1;
		System.out.println(caracter);
		char SegundoCaracter = (char) (caracter + 1);
		System.out.println(SegundoCaracter);
		
		String palabra = "Alura cursos online";
		System.out.println(palabra);
		
		palabra = palabra + " 2023";
		System.out.println(palabra);
		
		String cuota1 = "10" ;
		String cuota2 = "20" ;
		System.out.println (cuota1 + cuota2);
	}
}
