
public class EjercicioMatriz {
	public static void main(String[] args) {
		for (int fila = 0 ; fila <= 10 ; fila ++) {
			for (int columnas = 0 ; columnas <= 10 ; columnas ++) {
				if (fila <= columnas) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
