public class Ebook extends ItemBibliotecaDigital implements Baixavel {
    private int numeroPaginas;

    public Ebook(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String descricao() {
        return "Ebook: " + getTitulo() + " | Autor: " + getAutor()
                + " | Paginas: " + numeroPaginas;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o ebook '" + getTitulo() + "'...");
        System.out.println("Download concluido!");
    }
}