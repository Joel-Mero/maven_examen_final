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
			System.out.println("1. Ingresar Póliza");
			System.out.println("2. Actualizar Valor");
			System.out.println("3. Consultar Póliza");
			System.out.println("4. Imprima Reposrte");
			System.out.println("5. SALIR");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				System.out.println("-----Ecoga el tipp de Póliza-----");
				System.out.println("a. Póliza General");
				System.out.println("b. Póliza Vip");
				String poliza = teclado1.nextLine();

				if (poliza.equals("a")) {
					System.out.println("Ingrese Nombre");
					String nombre = teclado1.nextLine();
					System.out.println("Ingrese descripción");
					String descripcion = teclado1.nextLine();
					System.out.println("Ingrese Año vigencia");
					String anioVigencia = teclado1.nextLine();
					System.out.println("Ingrese Código de Póliza");
					String codigoPoliza = teclado1.nextLine();
					System.out.println("ingrese Valor de la Póliza");
					int valorPoliza = teclado.nextInt();
					System.out.println("Ingrese Código descuento");
					String codigoDescuento = teclado1.nextLine();
					System.out.println("Ingrese Número de Seguro");
					String numeroSeguro = teclado1.nextLine();
				} else {
					if (poliza.equals("b")) {
						System.out.println("Ingrese Nombre");
						String nombre = teclado1.nextLine();
						System.out.println("Ingrese descripción");
						String descripcion = teclado1.nextLine();
						System.out.println("Ingrese Año vigencia");
						String anioVigencia = teclado1.nextLine();
						System.out.println("Ingrese Código de Póliza");
						String codigoPoliza = teclado1.nextLine();
						System.out.println("Ingrese Valor de la Póliza");
						int valorPoliza = teclado.nextInt();
						System.out.println("Ingrese Beneficio");
						int beneficio = teclado.nextInt();

						Poliza listaPoliza[] = new Poliza[2];
					
					}
				}
			} else {
				if (opcion == 2) {
					System.out.println("Ingrese Código de Póliza");
					String codigoPoliza = teclado1.nextLine();
					
				} else {
					if (opcion == 3) {
						System.out.println("Ingrese Código de Póliza");
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
