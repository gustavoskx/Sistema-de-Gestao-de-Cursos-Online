package services;

public abstract class Curso {
    protected String titulo;
    protected String intrutor;
    protected int cargaHoraria;
    protected double precoPorHora;

    public Curso(String titulo, String intrutor, int cargaHoraria, double precoPorHora) {
        setTitulo(titulo);
        setIntrutor(intrutor);
        setCargaHoraria(cargaHoraria);
        setPrecoPorHora(precoPorHora);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("Título inválido. O título não pode ser nulo ou vazio.");
        }else{
            this.titulo = titulo;
        }
    }

    public String getIntrutor() {
        return intrutor;
    }

    public void setIntrutor(String intrutor) {
        if (intrutor == null || intrutor.isEmpty()) {
            System.out.println("Instrutor inválido. O instrutor não pode ser nulo ou vazio.");
        }else{
            this.intrutor = intrutor;
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria <= 0) {
            System.out.println("Carga horária inválida. A carga horária deve ser maior que zero.");
        }else{
            this.cargaHoraria = cargaHoraria;
        }
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        if (precoPorHora <= 0) {
            System.out.println("Preço por hora inválido. O preço por hora deve ser maior que zero.");
        }else{
            this.precoPorHora = precoPorHora;
        }
    }

    public abstract void mostrarDados();
    public abstract void calcularCusto();
}
