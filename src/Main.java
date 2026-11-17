import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Dom Casmurro", "Machado de Assis", 256);
        Ebook ebook2 = new Ebook("Java: Como Programar", "Paul Deitel", 1100);
        VideoDigital video1 = new VideoDigital("Introducao a POO", "Marina de Lara", 45);
        VideoDigital video2 = new VideoDigital("Interfaces em Java", "Marina de Lara", 30);

        // Colecao polimorfica de itens
        ArrayList<ItemBibliotecaDigital> acervo = new ArrayList<ItemBibliotecaDigital>();
        acervo.add(ebook1);
        acervo.add(ebook2);
        acervo.add(video1);
        acervo.add(video2);

        System.out.println("=== DESCRICAO DOS ITENS ===");
        for (ItemBibliotecaDigital item : acervo) {
            System.out.println(item.descricao());
        }

        System.out.println();
        System.out.println("=== DOWNLOADS ===");
        for (ItemBibliotecaDigital item : acervo) {
            if (item instanceof Baixavel) {
                Baixavel b = (Baixavel) item;
                b.baixar();
            }
        }

        System.out.println();
        System.out.println("=== VISUALIZACAO ===");
        for (ItemBibliotecaDigital item : acervo) {
            if (item instanceof Visualizavel) {
                Visualizavel v = (Visualizavel) item;
                v.visualizar();
            } else {
                System.out.println("'" + item.getTitulo() + "' nao pode ser visualizado.");
            }
        }
    }
}