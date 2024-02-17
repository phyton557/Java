import java.util.Scanner;
public class exercicio2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.println("Digite a quantidade de dependentes: ");
        int qtd = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o cargo do funcionário: ");
        String cargo = sc.nextLine();

        System.out.println("O funcionário(a) " + nome + " tem " + qtd + " dependentes e ocupa o cargo de " + cargo);
        sc.close();
    }
}