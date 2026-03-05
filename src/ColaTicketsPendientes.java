import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;

public class ColaTicketsPendientes {
    private ArrayList<Ticket> colaTickets;
    private BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
    );
    private  ListaTicketsResueltos listaTicketsResueltos;

    public ColaTicketsPendientes() {
        colaTickets = new ArrayList<>();
        listaTicketsResueltos = new ListaTicketsResueltos();
    }


    public void crearTicket() throws IOException {
        System.out.print("Ingrese el nombre del usuario: ");
        String nombreUsuario = br.readLine();

        System.out.print("Ingrese una descripcion al ticket: ");
        String descripcion = br.readLine();

        colaTickets.add(new Ticket(descripcion, nombreUsuario));
    }

    public void verFrente() {
        if (colaTickets.isEmpty()) {
            System.out.println("Lo sentimos. La cola esta vacia!");
            System.out.println();
            return;
        }
        System.out.println(colaTickets.getFirst());
    }

    public void resolverTicket() throws IOException {
        if (colaTickets.isEmpty()) {
            System.out.println("Lo sentimos. La cola esta vacia!");
            System.out.println();
            return;
        }


        Ticket ticket = colaTickets.getFirst();
        //Se ingresa la fecha de resolución
        ticket.setFechaResolucion(LocalDate.now());

        //Se agrega el primer ticket por prioridad a la lista de ticket resueltos
        listaTicketsResueltos.agregarTicket(colaTickets.getFirst());

        //Se elimina de esta lista el ticket
        colaTickets.removeFirst();

        System.out.println("Ticket resuelto con éxito");
        System.out.println();

    }
}