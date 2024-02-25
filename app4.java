package programas;
import java.util.Scanner;

import entities.Aluno;

public class app4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        System.out.println("Aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Informe as notas do 1º trimestre: ");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Informe as notas do  2º trimestre: ");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Informe as notas do 3º trimestre: ");
        aluno.nota3 = sc.nextDouble();


        if (aluno.Trimestres() >= 60) {
            System.out.println("NOTA FINAL: " + aluno.Trimestres());
            System.out.println("PASS");
        }else{
            double porc = 60 - aluno.Trimestres();
            System.out.println("FAILED");
            System.out.println("NOTA FINAL: " + aluno.Trimestres());
            System.out.println("MISSING: " + porc + " POINTS");
        }
        sc.close();

    }

}
