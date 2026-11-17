public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    private int duracaoMinutos;

    public VideoDigital(String titulo, String autor, int duracaoMinutos) {
        super(titulo, autor);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    @Override
    public String descricao() {
        return "Video: " + getTitulo() + " | Autor: " + getAutor()
                + " | Duracao: " + duracaoMinutos + " min";
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o video '" + getTitulo() + "'...");
        System.out.println("Download concluido!");
    }

    @Override
    public void visualizar() {
        System.out.println("Reproduzindo o video '" + getTitulo() + "'...");
    }
}