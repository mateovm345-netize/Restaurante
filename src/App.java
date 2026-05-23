import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        int total = 0;

        String factura = "";

        do {

            System.out.println("\n========== RESTAURANTE LAS PALMAS ==========");
            System.out.println("1. Entradas");
            System.out.println("2. Platos Fuertes");
            System.out.println("3. Bebidas");
            System.out.println("4. Postres");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {


                case 1:

                    System.out.println("\n------ ENTRADAS ------\n");

                    System.out.println("1. Empanadita de iglesia - $5.000");
                    System.out.println("Ingredientes: masa, carne molida, papa, cebolla.\n");

                    System.out.println("2. Arepa de choclo con queso - $4.500");
                    System.out.println("Ingredientes: choclo, queso, mantequilla, sal.\n");

                    System.out.println("3. Patacones con hogao - $6.000");
                    System.out.println("Ingredientes: plátano, cebolla, tomate y cilantro.\n");

                    System.out.print("Seleccione una entrada: ");
                    int entrada = sc.nextInt();

                    switch (entrada) {

                        case 1:
                            total += 5000;
                            factura += "Empanadita de iglesia - $5.000\n";
                            break;

                        case 2:
                            total += 4500;
                            factura += "Arepa de choclo con queso - $4.500\n";
                            break;

                        case 3:
                            total += 6000;
                            factura += "Patacones con hogao - $6.000\n";
                            break;

                        default:
                            System.out.println("Opcion invalida");
                    }

                    break;

                case 2:

                    System.out.println("\n------ PLATOS FUERTES ------\n");

                    System.out.println("1. Sancocho - $18.000");
                    System.out.println("Ingredientes: pollo, yuca, papa y mazorca.\n");

                    System.out.println("2. Bandeja Paisa - $32.000");
                    System.out.println("Ingredientes: arroz, frijoles, carne molida y chicharron.\n");

                    System.out.println("3. Lasaña de pollo - $24.000");
                    System.out.println("Ingredientes: pasta, pollo y queso.\n");

                    System.out.print("Seleccione un plato fuerte: ");
                    int plato = sc.nextInt();

                    switch (plato) {

                        case 1:
                            total += 18000;
                            factura += "Sancocho - $18.000\n";
                            break;

                        case 2:
                            total += 32000;
                            factura += "Bandeja Paisa - $32.000\n";
                            break;

                        case 3:
                            total += 24000;
                            factura += "Lasaña de pollo - $24.000\n";
                            break;

                        default:
                            System.out.println("Opcion invalida");
                    }

                    break;

                case 3:

                    System.out.println("\n------ BEBIDAS ------\n");

                    System.out.println("1. Limonada - $4.000");
                    System.out.println("Ingredientes: limón, agua y azúcar.\n");

                    System.out.println("2. Jugo de Naranja - $5.000");
                    System.out.println("Ingredientes: naranja fresca.\n");

                    System.out.println("3. Coca-Cola - $3.000");
                    System.out.println("Ingredientes: bebida gaseosa carbonatada.\n");

                    System.out.print("Seleccione una bebida: ");
                    int bebida = sc.nextInt();

                    switch (bebida) {

                        case 1:
                            total += 4000;
                            factura += "Limonada - $4.000\n";
                            break;

                        case 2:
                            total += 5000;
                            factura += "Jugo de Naranja - $5.000\n";
                            break;

                        case 3:
                            total += 3000;
                            factura += "Coca-Cola - $3.000\n";
                            break;

                        default:
                            System.out.println("Opcion invalida");
                    }

                    break;


                case 4:

                    System.out.println("\n------ POSTRES ------\n");

                    System.out.println("1. Arroz con leche - $8.000");
                    System.out.println("Ingredientes: arroz, leche y canela.\n");

                    System.out.println("2. Brownie con Helado - $10.000");
                    System.out.println("Ingredientes: chocolate, nueces y helado.\n");

                    System.out.println("3. Torta de tres leches - $13.000");
                    System.out.println("Ingredientes: leche evaporada y crema de leche.\n");

                    System.out.print("Seleccione un postre: ");
                    int postre = sc.nextInt();

                    switch (postre) {

                        case 1:
                            total += 8000;
                            factura += "Arroz con leche - $8.000\n";
                            break;

                        case 2:
                            total += 10000;
                            factura += "Brownie con Helado - $10.000\n";
                            break;

                        case 3:
                            total += 13000;
                            factura += "Torta de tres leches - $13.000\n";
                            break;

                        default:
                            System.out.println("Opcion invalida");
                    }

                    break;

                case 0:
                    System.out.println("\nGenerando factura...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);

        System.out.println("\n============= FACTURA =============");
        System.out.println(factura);
        System.out.println("-----------------------------------");
        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("Gracias por su compra");
        System.out.println("===================================");

        sc.close();
    }
}