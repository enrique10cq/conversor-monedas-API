import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        int opcion;
        double monto = 0;
        String menu = """
                Elije una de las opciones (escribe el número):
                1. Dólar =>> Sol peruano.
                2. Sol peruano =>> Dolar.
                3. Dólar =>> Peso mexicano.
                4. Peso mexicano =>> Dólar.
                5. Dólar =>> Euro.
                6. Euro =>> Dólar.
                7. Salir.
                """;

        System.out.println("************************************************");
        System.out.println("*     BIENVENIDO(A) AL CONVERSOR DE MONEDAS    *");
        System.out.println("************************************************\n");
        do {
            System.out.println(menu);
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.\n");
                scanner.next(); // Limpiar el buffer del scanner
                opcion = 0; // Asignar un valor por defecto para que continúe el bucle
                continue;
            }
            Moneda resultadoConversion;
            switch (opcion){
                case 1:
                    System.out.print("¿Cuál es el monto que desea convertir? ==> ");
                    monto = scanner.nextDouble();
                    resultadoConversion = consultaMoneda.convertirMoneda("USD", "PEN", monto);
                    System.out.println("La cantidad de "+monto+" Dólares, equivale a " + resultadoConversion.getConversionResultado()+" Soles\n");
                    break;
                case 2:
                    System.out.print("¿Cuál es el monto que desea convertir? ==> ");
                    monto = scanner.nextDouble();
                    resultadoConversion = consultaMoneda.convertirMoneda("PEN", "USD", monto);
                    System.out.println("La cantidad de "+monto+" Soles, equivale a " + resultadoConversion.getConversionResultado()+" Dólares\n");
                    break;
                case 3:
                    System.out.print("¿Cuál es el monto que desea convertir? ==> ");
                    monto = scanner.nextDouble();
                    resultadoConversion = consultaMoneda.convertirMoneda("USD", "MXN", monto);
                    System.out.println("La cantidad de "+monto+" Dólares, equivale a " + resultadoConversion.getConversionResultado()+" Pesos mexicanos\n");
                    break;
                case 4:
                    System.out.print("¿Cuál es el monto que desea convertir? ==> ");
                    monto = scanner.nextDouble();
                    resultadoConversion = consultaMoneda.convertirMoneda("MXN", "USD", monto);
                    System.out.println("La cantidad de "+monto+" Pesos mexicanos, equivale a " + resultadoConversion.getConversionResultado()+" Dólares\n");
                    break;
                case 5:
                    System.out.print("¿Cuál es el monto que desea convertir? ==> ");
                    monto = scanner.nextDouble();
                    resultadoConversion = consultaMoneda.convertirMoneda("USD", "EUR", monto);
                    System.out.println("La cantidad de "+monto+" Dólares, equivale a " + resultadoConversion.getConversionResultado()+" Euros\n");
                    break;
                case 6:
                    System.out.print("¿Cuál es el monto que desea convertir? ==> ");
                    monto = scanner.nextDouble();
                    resultadoConversion = consultaMoneda.convertirMoneda("EUR", "USD", monto);
                    System.out.println("La cantidad de "+monto+" Euros, equivale a " + resultadoConversion.getConversionResultado()+" Dólares\n");
                    break;
                case 7:
                    System.out.println("Gracias por usar nuestro conversor de monedas.");
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione un número del menú.\n");
            }
        } while (opcion != 7);
    }
}
