package maven_examen_final_aseguradora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAseguradora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);

		int opcion;
		do {
			System.out.println("-----ASEGURADORA DEL SUR-----");
			System.out.println("1. Ingresar P�liza");
			System.out.println("2. Actualizar Valor");
			System.out.println("3. Consultar P�liza");
			System.out.println("4. Imprima Reposrte");
			System.out.println("5. SALIR");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				System.out.println("-----Ecoga el tipp de P�liza-----");
				System.out.println("a. P�liza General");
				System.out.println("b. P�liza Vip");
				String poliza = teclado1.nextLine();

				if (poliza.equals("a")) {
					System.out.println("Ingrese Nombre");
					String nombre = teclado1.nextLine();
					System.out.println("Ingrese descripci�n");
					String descripcion = teclado1.nextLine();
					System.out.println("Ingrese A�o vigencia");
					String anioVigencia = teclado1.nextLine();
					System.out.println("Ingrese C�digo de P�liza");
					String codigoPoliza = teclado1.nextLine();
					System.out.println("ingrese Valor de la P�liza");
					int valorPoliza = teclado.nextInt();
					System.out.println("Ingrese C�digo descuento");
					String codigoDescuento = teclado1.nextLine();
					System.out.println("Ingrese N�mero de Seguro");
					String numeroSeguro = teclado1.nextLine();

					PolizaGeneral poliza1 = new PolizaGeneral();
					poliza1.setNombre(nombre);
					poliza1.setDescripcion(descripcion);
					poliza1.setAnioVigencia(anioVigencia);
					poliza1.setCodigoPoliza(codigoPoliza);
					poliza1.setValorPoliza(valorPoliza);
					poliza1.setValorDescuento(codigoDescuento);
					poliza1.setNumeroSeguro(numeroSeguro);

					Poliza listaPoliza[] = new Poliza[2];
					listaPoliza[0] = poliza1;

				} else {
					if (poliza.equals("b")) {
						System.out.println("Ingrese Nombre");
						String nombre = teclado1.nextLine();
						System.out.println("Ingrese descripci�n");
						String descripcion = teclado1.nextLine();
						System.out.println("Ingrese A�o vigencia");
						String anioVigencia = teclado1.nextLine();
						System.out.println("Ingrese C�digo de P�liza");
						String codigoPoliza = teclado1.nextLine();
						System.out.println("Ingrese Valor de la P�liza");
						int valorPoliza = teclado.nextInt();
						System.out.println("Ingrese Beneficio");
						int beneficio = teclado.nextInt();

						PolizaVip poliza2 = new PolizaVip();
						poliza2.setNombre(nombre);
						poliza2.setDescripcion(descripcion);
						poliza2.setAnioVigencia(anioVigencia);
						poliza2.setCodigoPoliza(codigoPoliza);
						poliza2.setValorPoliza(valorPoliza);
						poliza2.setBeneficio(codigoPoliza);

						Poliza listaPoliza[] = new Poliza[2];
						listaPoliza[1] = poliza2;
					}
				}

			} else {
				if (opcion == 2) {
					System.out.println("Ingrese C�digo de P�liza");
					String codigoPoliza = teclado1.nextLine();

				} else {
					if (opcion == 3) {
						System.out.println("Ingrese C�digo de P�liza");
						String codigoPoliza = teclado1.nextLine();
					} else {
						if (opcion == 4) {

						}
					}
				}
			}

		} while (opcion != 5);

	}

}