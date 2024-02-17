import java.util.Scanner;
public class exercicio12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número real: ");
        double real = sc.nextDouble();
        double triplo = real * 3;
        System.out.println("O triplo do número " + real + " é " + triplo);
        sc.close();
    }
}

