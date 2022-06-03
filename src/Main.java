import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float importe = 0;
        float sumaGastos = 0;
        boolean salir = false;
        int opcion = 0;
        Gasto gasto = null;
        String concepto = "";
        LibroCuentas libroDeCuentas = new LibroCuentas();


        while (!salir) {

            System.out.println("Seleccione una opción: \n");
            System.out.println("\t 1. Añadir un gasto.");
            System.out.println("\t 2. Ver lista de gastos.");
            System.out.println("\t 3. Calcular gasto total.");
            System.out.println("\t 4. Salir.");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Cual es el concepto del gasto: ");
                    concepto = scanner.nextLine();

                    System.out.print("Importe del gasto: ");
                    importe = scanner.nextFloat();
                    scanner.nextLine();

                    gasto = new Gasto(concepto, importe);
                    libroDeCuentas.addGasto(gasto);

                    System.out.println(concepto + " " + importe + " añadido.");
                    break;

                case 2:
                    System.out.println(libroDeCuentas);
                    break;

                case 3:
                    int tamanyoLibroCuentas = libroDeCuentas.size();

                    for (int i = 0; i < tamanyoLibroCuentas; i++) {
                        sumaGastos += libroDeCuentas.popGasto().getImporte();
                    }

                    System.out.println("Gasto total = " + sumaGastos);
                    break;

                case 4:
                    salir = true;
                    break;
            }
        }
    }
}
