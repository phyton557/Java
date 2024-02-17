import java.util.Scanner;
public class exercicio10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor gasto no restaurante: ");
        float valor = sc.nextFloat();
        double valorf = valor + 0.1;
        System.out.println("O valor total a ser pago é de R$" + valorf);
        sc.close();
    }
}

