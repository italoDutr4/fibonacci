import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int i;

    Scanner scan = new Scanner (System.in);

    System.out.println("Digite um número que faça parte da sequência de Fibonacci");
    i = scan.nextInt();

    while (i > n3) {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
    }

    if (i == 0) {
        System.out.println("O numero 0 está na sequência de Fibonacci");
    } else if (i == n3) {
        System.out.println("O número" + i + " está na sequência de Fibonacci.");
    } else {
        System.out.println("Este número não faz parte da sequência de Fibonacci.");

    }
    }
}
