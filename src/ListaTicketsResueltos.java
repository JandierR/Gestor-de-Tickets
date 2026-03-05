import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListaTicketsResueltos {
    private Ticket primerTicket;
    private BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
    );

    public ListaTicketsResueltos() {
    }

    public void agregarTicket(Ticket ticket) {
        ticket.setSiguiente(primerTicket);
        setPrimerTicket(ticket);

    }

    public Ticket buscarTicket() throws IOException {
        if (estaVacio()) {
            System.out.println("Lo sentimos. La lista esta vacía!");
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
            return null;
        }

        System.out.println("Se encontró el producto!");
        return temp;
    }

    public boolean estaVacio() {
        return primerTicket == null;
    }

    public Ticket getPrimerTicket() {
        return primerTicket;
    }

    public void setPrimerTicket(Ticket primerTicket) {
        this.primerTicket = primerTicket;
    }
}
