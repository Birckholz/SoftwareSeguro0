package src;

import java.util.ArrayList;

public class Album {
    private String genero;
    private String nome;
    private int ano;
    private Pessoa artista;
    private ArrayList<Musica> musicas;

    public Album (String genero, String nome, int ano, Pessoa artista) {
        this.genero = genero;
        this.ano = ano;
        this.artista = artista;
        this.nome = nome;
        this.musicas = new ArrayList<Musica>();
    }

    public void addMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public Pessoa getArtista() {
        return artista;
    }

    public String getMusicas() {
        return musicas.toString();
    }
}
