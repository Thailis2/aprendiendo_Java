
public class EjemplosCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean PuedeEntrar = edad >= 18 && esPareja;
		System.out.println("El resultado de la condición es " + esPareja);

		if (edad >= 18 || cantidadPersonas >= 2) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido!");
		} else {

			System.out.println("Usted no puede entrar");
		}
		
		if (edad >= 18 && cantidadPersonas >= 2) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido!");
		} else {

			System.out.println("Usted no puede entrar");
		}
		
		if (edad >= 18 && esPareja) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido!");
		} else {

			System.out.println("Usted no puede entrar");
		}
		
		if (PuedeEntrar) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido!");
		} else {

			System.out.println("Usted no puede entrar");
		}

	}
}
