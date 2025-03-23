import java.util.Scanner;

public class exec11602{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota do aluno (de 0 a 10): ");
        double nota = input.nextDouble();

        if(nota < 0 || nota > 10 ){
            System.out.println("Nota inválida! Digite um valor entre 0 e 10");
        } else {
            if (nota > 7){
                System.out.println("Aluno APROVADO!");
            } else if (nota>=5){
                System.out.println("Aluno em RECUPERAÇAO.");
            } else {
                System.out.println("Aluno REPROVADO.");
            }
        }
    }
}