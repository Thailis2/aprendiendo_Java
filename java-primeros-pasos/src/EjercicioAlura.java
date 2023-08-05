
public class EjercicioAlura {

	public static void main(String[] args) {

		double valorCompra = 250.0;
		System.out.println("El valor total de su compra es " + (valorCompra));

		if (valorCompra >= 100.0 && valorCompra <= 199.99) {
			System.out.println("El descuento de su compra es 10%: " + (valorCompra - (valorCompra * 0.10)));
		}
		if (valorCompra >= 200.0 && valorCompra <= 299.99) {
			System.out.println("El descuento de su compra es 15%: " + (valorCompra - (valorCompra * 0.15)));
		}
		if (valorCompra >= 300) {
			System.out.println("El descuento de su compra es 20%: " + (valorCompra - (valorCompra * 0.20)));
		}

		//solucion alura

		//double valorCompra = 250.0;
		double descuento = 0.0;

		if (valorCompra >= 100.0 && valorCompra < 200.0) {
			descuento = 10.0;
		} else if (valorCompra >= 200.0 && valorCompra < 300.0) {
			descuento = 15.0;
		} else if (valorCompra >= 300.0) {
			descuento = 20.0;
		}

		double valorFinal = valorCompra - (valorCompra * (descuento / 100));

		System.out.println("Valor de la compra: $" + valorCompra);
		System.out.println("Descuento: " + descuento + "%");
		System.out.println("Valor final: $" + valorFinal);
	}

}
