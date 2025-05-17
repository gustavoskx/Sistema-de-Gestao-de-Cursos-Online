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
        if (linguagem == null || linguagem.isEmpty()) {
            System.out.println("Linguagem inválida. A linguagem não pode ser nula ou vazia.");
        }else{
            this.linguagem = linguagem;
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Curso Cadastrado: {" +
                            "\n     Título: " + titulo +
                            "\n     Instrutor: " + intrutor +
                            "\n     Carga Horária: " + cargaHoraria +
                            "\n     Preço por Hora: " + precoPorHora +
                            "\n     Linguagem: " + linguagem +
                            "\n }");
    }
    @Override
    public void calcularCusto(){
        if(cargaHoraria > 50){
            System.out.println("    O custo do curso de programação é: " + (cargaHoraria * precoPorHora * 0.9) + " (10% de desconto aplicado)");
        }else{
            System.out.println("    O custo do curso de programação é: " + (cargaHoraria * precoPorHora));
        }
    }
}
