import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int say, deger, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Toplanacak değerleri giriniz: ");

        for (say = 0; 10 > say; say++) {
            deger = input.nextInt();
            result += deger;
        }
        System.out.println("Değerler toplamı: " + result);
    }
}