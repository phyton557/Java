import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        sc.close();
        if (num >=0 && num <=9) {
            System.out.println("Valor correto");
        } else {
            System.out.println("Valor incorreto");
        }
    }
}