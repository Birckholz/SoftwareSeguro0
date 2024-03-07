package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Pessoa> listPessoas = new ArrayList<>();
    static ArrayList<Musica> listaMusica = new ArrayList<>();

    public static void addPessoa() {
        boolean lever = true;
        while (lever) {
            System.out.println("Digite o nome da Pessoa: ");
            String nome = scan.nextLine();
            System.out.println("Digite a idade da Pessoa: ");
            int idade = Integer.parseInt(scan.nextLine());
            listPessoas.add(new Pessoa(nome, idade));
            System.out.println("Deseja adicionar mais uma pessoa? Se sim, digite 1: ");
            int choice = Integer.parseInt(scan.nextLine());
            if (choice != 1) {
                lever = false;
            }
        }
    }

    public static Pessoa findP(String target) {
        for (Pessoa p : listPessoas) {
            if (target.equals(p.getNome())) {
                return p;
            }
        }
        return null;
    }

    public static Musica findM(String target) {
        for (Musica m : listaMusica) {
            if (target.equals(m.getTitulo())) {
                return m;
            }
        }
        return null;
    }

    public static void addMusica() {
        boolean lever = true;
        while (lever) {
            System.out.println("Digite o nome da Música: ");
            String titulo = scan.nextLine();
            System.out.println("Digite a duração da música em segundos: ");
            int dur = Integer.parseInt(scan.nextLine());
            System.out.println("Digite o nome do Compositor: ");
            String comp = scan.nextLine();
            listaMusica.add(new Musica(titulo, dur, findP(comp)));
            System.out.println("Deseja adicionar mais uma música? Se sim, digite 1: ");
            int choice = Integer.parseInt(scan.nextLine());
            if (choice != 1) {
                lever = false;
            }
        }
    }

    public static Album addAlbum() {
        System.out.println("Digite o nome do gênero: ");
        String genero = scan.nextLine();
        System.out.println("Digite o ano do álbum: ");
        int ano = Integer.parseInt(scan.nextLine());
        System.out.println("Digite o nome do artista: ");
        String nomeArt = scan.nextLine();
        System.out.println("Digite o nome do álbum: ");
        String nomeAlbum = scan.nextLine();

        Album a = new Album(genero, nomeAlbum, ano, findP(nomeArt));
        boolean lever = true;
        while (lever) {
            System.out.println("Digite o nome das músicas que fazem parte do álbum: ");
            String nomeM = scan.nextLine();
            a.addMusica(findM(nomeM));
            System.out.println("Deseja adicionar mais uma música? Se sim, digite 1: ");
            int choice = Integer.parseInt(scan.nextLine());
            if (choice != 1) {
                lever = false;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        addPessoa();
        addMusica();
        addAlbum();
    }
}