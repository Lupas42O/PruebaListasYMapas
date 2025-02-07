package pruebaColecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clinica {

	void mostrarMenu() {
		System.out.println("----------MENU DE LA CLINICA----------");
		System.out.println("1. Introducir datos de un paciente nuevo");
		System.out.println("2. Obtener los datos de un paciente");
		System.out.println("3. Averiguar si un paciente tiene fiebre o no");
		System.out.println("4. Mostrar codigo y nombre de los pacientes mayores a 65 años");
		System.out.println("5. Modificar el colesterol de un paciente");
		System.out.println("6. Mostrar el nº de pacientes que tienen colesterol alto (mayor a 300)");
		System.out.println("7. Eliminar un paciente en concreto");
		System.out.println("8. Salir del programa");

	}

	public static void main(String[] args) {
		List<Paciente> pacientes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Clinica cl = new Clinica();
		int opcion = 0;

		do {
			cl.mostrarMenu();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduce su código");
				int cod = sc.nextInt();
				System.out.println("Introduce su nombre");
				String nom = sc.next();
				System.out.println("Introduce la edad");
				int ed = sc.nextInt();
				System.out.println("Introduce la temperatura medida la última noche");
				double temp = sc.nextDouble();
				System.out.println("Introduce el nivel de colesterol");
				double col = sc.nextDouble();
				Paciente pac = new Paciente(cod, nom, ed, temp, col);
				pacientes.add(pac);
				break;

			case 2:
				System.out.println("Introduce el código del paciente");
				int codigo = sc.nextInt();
				for (Paciente paciente : pacientes) {
					if (paciente.getCodigo() == codigo) {
						System.out.println("Código: " + paciente.getCodigo() + ".");
						System.out.println("Nombre: " + paciente.getNombre() + ".");
						System.out.println("Edad: " + paciente.getEdad() + ".");
						System.out.println("Temperatura: " + paciente.getTemperatura() + ".");
						System.out.println("Nivel de colesterol: " + paciente.getColesterol() + ".");
					}
				}
				break;

			case 3:
				System.out.println("Introduce el código del paciente");
				int code = sc.nextInt();
				for (Paciente paciente : pacientes) {
					if (paciente.getCodigo() == code) {
						if (paciente.getTemperatura() > 37.5) {
							System.out.println("El paciente " + paciente.getCodigo() + " tiene fiebre");
						} else {
							System.out.println("El paciente " + paciente.getCodigo() + " no tiene fiebre");
						}
					}
				}
				break;

			case 4:
				for (Paciente paciente : pacientes) {
					if (paciente.getEdad() >= 65) {
						System.out.println("Código: " + paciente.getCodigo() + ".");
						System.out.println("Nombre: " + paciente.getNombre() + ".");
					}
				}
				break;

			case 5:
				System.out.println("Introduce el código del paciente");
				int codig = sc.nextInt();
				for (Paciente paciente : pacientes) {
					if (paciente.getCodigo() == codig) {
						System.out.println("Introduce la cantidad de colesterol actual del paciente");
						double colesterol = sc.nextDouble();
						paciente.setColesterol(colesterol);
					}
				}
				break;

			case 6:
				int pacColesterol = 0;
				for (Paciente paciente : pacientes) {
					if (paciente.getColesterol() >= 300) {
						pacColesterol++;
					}
				}
				System.out.println("Nº de pacientes con colesterol alto: " + pacColesterol + ".");
				break;

			case 7:
				System.out.println("Introduce el código del paciente que desees ELIMINAR");
				int codigo2 = sc.nextInt();
				for (int i = 0; i < pacientes.size(); i++) {
					if (pacientes.get(i).getCodigo() == codigo2) {
						pacientes.remove(pacientes.get(i));
					}
				}
				System.out.println("Paciente borrado con éxito");
				break;

			default:
				System.out.println("Opción introducida no válida");
				break;
			}
		} while (opcion != 8);
	}
}
