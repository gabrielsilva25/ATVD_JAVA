package Media;

import java.util.Scanner;

public class Aluno {

    protected int nota1, nota2;

    public void pegarNotas() {
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com a primeira nota");
        nota1 = in.nextInt();

        System.out.println("Entre com a segunda nota");
        nota2 = in.nextInt();
    }

    public double calcularMedia(){
        return (nota1 + nota2) /2;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.pegarNotas();
        double media = aluno.calcularMedia();

        if (media >= 7){
            System.out.println("o aluno foi aprovado");
        } else {
            System.out.println("o aluno foi reprovado");
        }
    }
}

class Alunoads extends Aluno {
     private int trabalho1, trabalho2;
    @Override
    public void pegarNotas() {
        super.pegarNotas();
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com a primeiro trabalho");
        trabalho1 = in.nextInt();

        System.out.println("Entre com a segundo trabalho");
        trabalho2 = in.nextInt();
    }
    @Override
    public double calcularMedia(){
        double mediaNotas = super.calcularMedia();
        return (mediaNotas  + trabalho1 + trabalho2)/ 4;
    }

    public static void main(String[] args) {
        Alunoads aluno = new Alunoads();
        aluno.pegarNotas();
        double media = aluno.calcularMedia();

        if (media >= 7 ){
            System.out.println("o aluno foi aprovado");
        } else {
            System.out.println("o aluno foi reprovado");
        }
    }
} 