import java.time.LocalDate;

public class Ticket {
    private int id;
    private String descripcion;
    private String nombreUsuario;
    private LocalDate fechaCreacion;
    private LocalDate fechaResolucion;
    private static int contador = 1;
    private Ticket siguiente;


    public Ticket(String descripcion, String nombreUsuario) {
        this.id = contador++;
        this.descripcion = descripcion;
        this.nombreUsuario = nombreUsuario;
        this.fechaCreacion = LocalDate.now();
        this.fechaResolucion = null;
        siguiente = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public static int getContador() {
        return contador;
    }

    public Ticket getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Ticket siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", nombre='" + nombreUsuario + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaResolucion=" + fechaResolucion +
                '}';
    }
}
