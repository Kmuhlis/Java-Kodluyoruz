import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi, toplam = 0, basamak;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Girin: ");
        sayi = input.nextInt();

        System.out.println("Girilen Sayı: " + sayi);

        while (sayi > 0) {
            basamak = sayi % 10;
            sayi /= 10;
            toplam += basamak;
        }
        System.out.println("Basamaklar Toplamı: " + toplam);
    }
}