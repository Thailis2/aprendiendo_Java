
public class EjemploCiclos {
	public static void main(String[] args) {
		int contador = 0 ;
		
		while (contador <= 10) {
			System.out.println(contador);
			//contador = contador + 1; esta es una forma de hacerlo pero antipatron lo correcto seria:
			
			contador += 1;
			
			//tambien puede ser contador ++;
		}
	}
}
