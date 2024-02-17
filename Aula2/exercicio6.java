import java.util.Scanner;
public class exercicio6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o cateto oposto: ");
        double co = sc.nextDouble();
        System.out.println("Digite o cateto adjacente: ");
        double ca = sc.nextDouble();
        double hip = (co*co)+(ca*ca);
        double hipf = Math.sqrt(hip);
        System.out.println("A hipotenusa do triângulo é " + hipf + "cm");
        sc.close();
    }
}

