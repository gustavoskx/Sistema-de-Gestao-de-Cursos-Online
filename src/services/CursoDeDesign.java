package services;

public class CursoDeDesign extends Curso {
    private String ferramenta;

    public CursoDeDesign(String titulo, String intrutor, int cargaHoraria, double precoPorHora, String ferramenta) {
        super(titulo, intrutor, cargaHoraria, precoPorHora);
        setFerramenta(ferramenta);
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        if (ferramenta == null || ferramenta.isEmpty()) {
            System.out.println("Ferramenta inválida. A ferramenta não pode ser nula ou vazia.");
        } else {
            this.ferramenta = ferramenta;
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Curso Cadastrado: {" +
                "\n     Título: " + titulo +
                "\n     Instrutor: " + intrutor +
                "\n     Carga Horária: " + cargaHoraria +
                "\n     Preço por Hora: " + precoPorHora +
                "\n     Ferramenta: " + ferramenta +
                "\n }");
    }

    @Override
    public void calcularCusto() {
        if (cargaHoraria < 20) {
            System.out.println("    O custo do curso de design é: " + (cargaHoraria * precoPorHora * 1.05) + " (5% de taxa adicional aplicada)");
        } else {
            System.out.println("    O custo do curso de design é: " + (cargaHoraria * precoPorHora));
        }
    }
}
