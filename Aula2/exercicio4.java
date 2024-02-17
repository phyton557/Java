import java.util.Scanner;
public class exercicio4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do cilindro:");
        int raio = sc.nextInt();
        System.out.println("Digite a altura do cilindro:");
        int alt = sc.nextInt();
        double volume = (raio * raio) * 3.14 * alt;

        System.out.println("O volume do cilindro é " + volume + " cm\u00B3");
        sc.close(); 
    }
}
