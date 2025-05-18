package services;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();

        cursos.add(new CursoDeProgramacao("Java Básico", "Ana", 40, 50.0, "Java"));
        cursos.add(new CursoDeDesign("Design Gráfico", "Carlos", 15, 60.0, "Photoshop"));
        cursos.add(new CursoDeProgramacao("Python Avançado", "Maria", 60, 70.0, "Python"));
        cursos.add(new CursoDeDesign("UI/UX Design", "João", 25, 80.0, "Figma"));

        System.out.println("---------------------------------------");
        for (Curso curso : cursos) {
            System.out.println("===============================");
            curso.mostrarDados();
            System.out.println();
            curso.gerarRelatorio();
            System.out.println("===============================");
        }
        System.out.println("---------------------------------------\n");
    }
}
