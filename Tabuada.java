import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, j;
        System.out.print("Digite o valor da Tabuada: \n");
        j = ler.nextInt();
        System.out.println("Resultado");
        for (i = 0; i <= 10; i++) {
            System.out.println(i + " x " + j + " = " + (i * j));

        }
    }


}
