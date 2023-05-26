import java.time.LocalDate;

public class Libro {
    private int id;
    private LocalDate fPrestamo, fEntrega;
    private String titulo, categoria;

    public Libro(int id, LocalDate fPrestamo, LocalDate fEntrega, String titulo, String categoria) {
        this.id = id;
        this.fPrestamo = fPrestamo;
        this.fEntrega = fEntrega;
        this.titulo = titulo;
        this.categoria = categoria;
    }
}
