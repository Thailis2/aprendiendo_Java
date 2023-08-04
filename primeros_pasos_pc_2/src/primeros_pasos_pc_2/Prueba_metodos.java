package primeros_pasos_pc_2;

public class Prueba_metodos {
	public static void main(String[] args) {
		cuenta cuentaDeDiego = new cuenta();
		cuentaDeDiego.saldo = 300;
		cuentaDeDiego.depositar(300.0);
		
		System.out.println(cuentaDeDiego.saldo);
		
		cuentaDeDiego.retirar(100);
		System.out.println(cuentaDeDiego.saldo);
		
		cuenta micuenta = new cuenta();
		micuenta.depositar(1000);
		micuenta.transferir(400, cuentaDeDiego);
		
		System.out.println(cuentaDeDiego.saldo);
		System.out.println(micuenta.saldo);
	}
}
