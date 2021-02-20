package metodoOrdenamientoBusqueda;

import java.util.Scanner;

public class tarea1 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);

		Double DPI[] = new Double[50];
		int Edad[] = new int[50];
		String Nombre[] = new String[50];

		int orden = 1;
		Double oDPI;
		int oEdad;
		String oNombre;

		for (int i = 0; i < 3; i++) {

			System.out.println("Ingresar DPI (sin guiones)");
			DPI[i] = ingreso.nextDouble();
			System.out.println("Ingresar su nombre ");
			Nombre[i] = ingreso.next();
			System.out.println("Ingresar su edad");
			Edad[i] = ingreso.nextInt();

		}
		System.out.println("Para ver los Datos ingresados ingrese 1");
		int ver = ingreso.nextInt();

		for (int i = 0; i < 3; i++) {
			orden = i;
			oDPI = DPI[i];
			oEdad = Edad[i];
			oNombre = Nombre[i];

		}
		for (int i = 0; i < 3; i++) {
			System.out.println("No. " + (i + 1));
			System.out.println("DPI:  " + DPI[i]);
			System.out.println("Nombre:" + Nombre[i]);
			System.out.println("Edad: " + Edad[i]);
		}

	}

}
