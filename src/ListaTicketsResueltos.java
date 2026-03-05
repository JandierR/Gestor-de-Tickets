import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListaTicketsResueltos {
    private static Ticket primerTicket;
    private static BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
    );

    public ListaTicketsResueltos() {
        primerTicket = null;
    }

    public void agregarTicket(Ticket ticket) {
        ticket.setSiguiente(primerTicket);
        setPrimerTicket(ticket);
        System.out.println("Se agrego con exito el ticket " + ticket);
        System.out.println();
    }

    public static Ticket buscarTicketResuelto() throws IOException {
        if (estaVacio()) {
            System.out.println("Lo sentimos. La lista esta vacía!");
            System.out.println();
            return null;
        }

        System.out.print("Ingrese el ID del ticket que desea buscar: ");
        int id = Integer.parseInt(br.readLine());


        Ticket temp = primerTicket;
        while (temp != null && temp.getId() != id) {
            temp = temp.getSiguiente();
        }
        if (temp == null) {
            System.out.println("El ticket no se encontró!");
            System.out.println();
            return null;
        }

        System.out.println("Se encontró el producto!");
        System.out.println();
        return temp;
    }

    public static boolean estaVacio() {
        return primerTicket == null;
    }

    public Ticket getPrimerTicket() {
        return primerTicket;
    }

    public void setPrimerTicket(Ticket primerTicket) {
        ListaTicketsResueltos.primerTicket = primerTicket;
    }
}
