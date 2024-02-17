import java.util.Scanner;
import javax.swing.JOptionPane;

public class exemplo {
    public static void main(String[] args) {
        int num, i;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        temp = "";
        for(i=0; i<11; i++) {
            temp += String.format("%d * %d = %d \n", num, i, (num*i));
            JOptionPane.showMessageDialog(null, temp);
            sc.close();
        }
    }

}