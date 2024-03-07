package src;

public class Musica {
    private String titulo;
    private int duracaoEmSec;
    private Pessoa compositor;

    public Musica(String titulo, int duracaoEmSec, Pessoa compositor) {
        this.compositor = compositor;
        this.duracaoEmSec = duracaoEmSec;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmSec() {
        return duracaoEmSec;
    }

    public Pessoa getCompositor() {
        return compositor;
    }
}
