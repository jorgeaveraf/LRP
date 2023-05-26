import java.time.LocalDate;

public class Prestamo {
private int id, idLibro, idLector;
private LocalDate fPrestamos, fEntrega;
private String categoria;

    public Prestamo(int id, int idLibro, int idLector, LocalDate fPrestamos, LocalDate fEntrega, String categoria) {
        this.id = id;
        this.idLibro = idLibro;
        this.idLector = idLector;
        this.fPrestamos = fPrestamos;
        this.fEntrega = fEntrega;
        this.categoria = categoria;
    }
}
