import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float a, sonuc = 0;
        int m = 0, kackez;

        Scanner input = new Scanner(System.in);

        System.out.print("Kac değer toplamasını istiyorsunuz: ");
        kackez = input.nextInt();

        while (m < kackez) {
            System.out.print("Değer giriniz: ");
            a = input.nextFloat();
            sonuc = a + sonuc;
            m += 1;
        }
        System.out.println("Toplama İşleminin Sonucu: " + sonuc);
    }
}
