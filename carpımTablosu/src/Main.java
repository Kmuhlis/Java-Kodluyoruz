import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, i = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Çarpım tablosunu istediğiniz rakamı girin: ");
        a = input.nextInt();

        if (a < 11 && 0 < a) {
            while (10 > i) {
                i++;
                b = a * i;
                System.out.println(a + " * " + i + " = " + b);
            }
        } else {
            System.out.println("Lütfen rakam girin.");
        }
    }
}
