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
        if (ferramenta == null || ferramenta.trim().isEmpty()) {
            System.out.println("Ferramenta inválida. A ferramenta não pode ser nula ou vazia.");
        } else {
            this.ferramenta = ferramenta;
        }
    }

    @Override
    public void mostrarDados() {
        double custoTotal = calcularCusto();
        System.out.println("Cadastro de Curso: {");
        System.out.println("Curso: " + titulo);
        System.out.println("Tipo: Design");
        System.out.println("Ferramenta: " + ferramenta);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Preço por Hora: R$ " + precoPorHora);
        if (cargaHoraria < 20) {
            System.out.println("Resultado:");
            System.out.println("Custo Total: R$ " + custoTotal + " (com taxa adicional de 5%).");
        } else {
            System.out.println("Resultado:");
            System.out.println("Custo Total: R$ " + custoTotal + ".");
        }
        System.out.println("}");
    }

    @Override
    public void gerarRelatorio() {
        double custoTotal = calcularCusto();
        System.out.println("Relatório: {");
        System.out.println("Título: " + titulo);
        System.out.println("Instrutor: " + intrutor);
        System.out.println("Ferramenta: " + ferramenta);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("Custo Total: R$ " + custoTotal);
        System.out.println("}");
    }

    @Override
    public double calcularCusto() {
        if (cargaHoraria < 20) {
            return cargaHoraria * precoPorHora * 1.05;
        }
        return cargaHoraria * precoPorHora;
    }
}
