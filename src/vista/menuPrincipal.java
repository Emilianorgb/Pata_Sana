package vista;

import java.util.Scanner;

public class menuPrincipal {

    Scanner teclado = new Scanner(System.in);

    public void mostrarMenu() {

        int opcion;

        do {

            System.out.println("\n========= PATASANA =========");
            System.out.println("1. Propietarios");
            System.out.println("2. Mascotas");
            System.out.println("3. Citas");
            System.out.println("4. Consultas");
            System.out.println("5. Servicios");
            System.out.println("6. Veterinarios");
            System.out.println("7. Vacunas");
            System.out.println("8. Cobros");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    new propietarioVista().menu();
                    break;

                case 2:
                    new mascotaVista().menu();
                    break;

                case 3:
                    new citaVista().menu();
                    break;

                case 4:
                    new consultaVista().menu();
                    break;

                case 5:
                    new servicioVista().menu();
                    break;

                case 6:
                    new veterinarioVista().menu();
                    break;

                case 7:
                    new vacunaVista().menu();
                    break;

                case 8:
                    new cobroVista().menu();
                    break;

                case 0:
                    System.out.println("Gracias por utilizar el sistema.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");

            }

        } while (opcion != 0);

    }

}