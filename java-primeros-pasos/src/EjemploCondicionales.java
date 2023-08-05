
public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		int edad = 17;
		int cantidad = 1;

		if (edad >= 18) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido!");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad pero puede entrar");
			} else {
				System.out.println("Usted no puede entrar");
			}

		}
		double salario = 3300.0;
		if (salario < 2600.0) {
		    System.out.println ("Su tasa es del 15%");
		    System.out.println ("Puede deducir R $ 350");
		}

		if (salario < 3750.0) {
		    System.out.println ("Su tasa es del 22.5%");
		    System.out.println ("Puede deducir R $ 636");
		}
	}
}
