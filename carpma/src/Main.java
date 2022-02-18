import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a, sonuc = 1;
        int kackez = 0, i = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Kac değer carpmasını istiyorsunuz: ");
        kackez = input.nextInt();

        while (i < kackez) {
            System.out.print("Değer gir: ");
            a = input.nextFloat();
            sonuc = a * sonuc;
            i++;
        }
        System.out.println("İşlem sonucu: " + sonuc);
    }
}
