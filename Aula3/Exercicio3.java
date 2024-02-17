import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor da bolsa? ");
        int valor = sc.nextInt();
        System.out.println("Qual o tempo de estágio? ");
        int tempo = sc.nextInt();
        sc.close();
        if (valor >= 750 && valor <= 950 && tempo >= 2) {
            System.out.println("Participará do treinamento");
        } else {
            System.out.println("Não participará");
        }
    }
}