package services;

public class CursoDeProgramacao extends Curso{
    private String linguagem;

    public CursoDeProgramacao(String titulo, String intrutor, int cargaHoraria, double precoPorHora, String linguagem) {
        super(titulo, intrutor, cargaHoraria, precoPorHora);
        setLinguagem(linguagem);
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        if (linguagem == null || linguagem.trim().isEmpty()) {
            System.out.println("Linguagem inválida. A linguagem não pode ser nula ou vazia.");
        }else{
            this.linguagem = linguagem;
        }
    }

    @Override
    public void mostrarDados() {
        double custoTotal = calcularCusto();
        System.out.println("Cadastro de Curso: {");
        System.out.println("Curso: " + titulo);
        System.out.println("Tipo: Programação");
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Preço por Hora: R$ " + precoPorHora);
        if (cargaHoraria > 50) {
            System.out.println("Resultado:");
            System.out.println("Custo Total: R$ " + custoTotal + " (com desconto de 10%).");
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
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("Custo Total: R$ " + custoTotal);
        System.out.println("}");
    }

    @Override
    public double calcularCusto(){
        if(cargaHoraria > 50) {
            return cargaHoraria * precoPorHora * 0.9;
        }
            return cargaHoraria * precoPorHora;
    }
}
