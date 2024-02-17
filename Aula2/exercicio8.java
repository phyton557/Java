import java.util.Scanner;
public class exercicio8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int hora = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int min = sc.nextInt();
        if (hora>=0 && hora <=23 && min>=0 && min <=59 ) {
            int minicio = hora * 60 + min;
            System.out.println("Minutos desde o início do dia: " + minicio + " minutos");
        } else {
            System.out.println("Valor digitado fora do intervalo!");
        }
        sc.close();
    }
}

