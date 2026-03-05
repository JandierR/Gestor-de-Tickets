import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
    );

    private static ListaTicketsResueltos listaTicketsResueltos;

    private static ColaTicketsPendientes colaTicketsPendientes = new ColaTicketsPendientes();

    public static void main(String[] args) throws IOException {
        int opcion;
        do {
            menuPrincipal();
            opcion = leerOpcion();
            procesarOpcionMenuPrincipal(opcion);
        } while (opcion != 0);
    }

    public static void menuPrincipal() {
        System.out.println("""
                Elija una opción
                -1. Entrar como Administrador
                -2. Entrar como Usuario
                -0. Salir""");
        System.out.println();
    }

    public static void menuAdministrador() {
        System.out.println("""
                Elija una opción
                -1. Ver ticket
                -2. Resolver ticket
                -0. Salir""");
        System.out.println();

    }

    public static void menuUsuario() {
        System.out.println("""
                Elija una opción
                -1. Crear ticket
                -2. Buscar ticket resuelto
                -0. Salir""");
        System.out.println();

    }

    public static void procesarOpcionMenuPrincipal(int opcion) throws IOException {
        if (opcion == 1) {
            menuAdministrador();

            int segundaOpcion = leerOpcion();
            if (segundaOpcion == 1) {
                colaTicketsPendientes.verFrente();
            } else if (segundaOpcion == 2) {
                colaTicketsPendientes.resolverTicket();
            } else if (segundaOpcion == 0) {
                System.out.println("Volviendo...\n");

            } else {

                System.out.println("Valor invalido");
            }

        } else if (opcion == 2) {
            menuUsuario();

            int segundaOpcion = leerOpcion();
            if (segundaOpcion == 1) {
                colaTicketsPendientes.crearTicket();
            } else if (segundaOpcion == 2) {
                System.out.println(ListaTicketsResueltos.buscarTicketResuelto()
                );
            } else if (segundaOpcion == 0) {
                System.out.println("Volviendo...\n");
            } else {

                System.out.println("Valor invalido");
            }
        } else if (opcion == 0) {
            System.out.println("Saliendo del sistema...");
        } else {

            System.out.println("Valor invalido");
        }
    }

    public static int leerOpcion() throws IOException {
        return Integer.parseInt(br.readLine());

    }
}
