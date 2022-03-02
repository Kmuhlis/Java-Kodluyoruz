import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] tCumle;
        String cumle;

        Scanner input = new Scanner(System.in);

        System.out.print("Cümleyi girin:");
        cumle = input.nextLine();

        tCumle = cumle.split(" ");
        Arrays.sort(tCumle);

        for (String result : tCumle) {
            System.out.print(result + " ");
        }
    }
}
