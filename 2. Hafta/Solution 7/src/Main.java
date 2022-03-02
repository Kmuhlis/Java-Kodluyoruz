import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String metin;
        int i=1,k;
        Scanner input = new Scanner(System.in);

        System.out.print("Metni giriniz: ");
        metin = input.nextLine();

        System.out.print("Kac defa yazılsın: ");
        k = input.nextInt();

        while (i<=k) {
            System.out.println(metin);
            i++;
        }
    }
}
