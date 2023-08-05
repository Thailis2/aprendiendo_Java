
public class prueba_metodos {
	public static void main(String[] args) {
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.saldo = 300;
		cuentaDeDiego.depositar(300.0);
		
		System.out.println(cuentaDeDiego.saldo);
		
		cuentaDeDiego.retirar(100);
		System.out.println(cuentaDeDiego.saldo);
		
		Cuenta micuenta = new Cuenta();
		micuenta.depositar(1000);
		micuenta.transferir(400, cuentaDeDiego);
		
		System.out.println(cuentaDeDiego.saldo);
		System.out.println(micuenta.saldo);
	}

}
