
public class EjemploScope {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		int edad = 21;
		int cantidadPersonas = 2;

		boolean esPareja;
		if (cantidadPersonas > 1) {
			esPareja = true;
		}
		else {
			esPareja = false;
		}
		boolean PuedeEntrar = edad >= 18 && esPareja;
		System.out.println("El resultado de la condición es " + esPareja);

		if (PuedeEntrar) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido!");
		} else {

			System.out.println("Usted no puede " + "entrar");
		}
	}
}
